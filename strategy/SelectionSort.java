/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sinan
 */
public class SelectionSort implements SortType
{

    @Override
    public int[] sort(int[] arr)
    {
	System.out.print("I am doing Selection Sort--->");
	for (int i = 0; i < arr.length - 1; i++)
	{
	    int min = arr[i];
	    int minIndex = i;

	    for (int j = i + 1; j < arr.length; j++)
	    {
		if (min > arr[j])
		{
		    min = arr[j];
		    minIndex = j;
		}
	    }

	    if (minIndex != i)
	    {
		arr[minIndex] = arr[i];
		arr[i] = min;
	    }

	}

	return arr;
    }

}
