/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sinan
 */
public class MergeSort implements SortType
{

    @Override
    public int[] sort(int[] arr)
    {
	System.out.print("I am doing Merge Sort --->");

	partition(arr, 0, (arr.length - 1));

	return arr;

    }

    private void partition(int[] arr, int low, int high)
    {
	int mid;

	if (low < high)
	{
	    mid = (low + high) / 2;
	    partition(arr, low, mid);
	    partition(arr, mid + 1, high);
	    merge(arr, low, mid, high);
	}
    }

    private void merge(int[] arr, int low, int mid, int high)
    {
	int i, j, k;
	int[] leftSide = new int[50];
	int[] rightSide = new int[50];

	int numberOfLeftSide = mid - low + 1;
	int numberOfRightSide = high - mid;

	for (i = 0; i < numberOfLeftSide; i++)
	{
	    leftSide[i] = arr[i + low];
	}

	for (j = 0; j < numberOfRightSide; j++)
	{
	    rightSide[j] = arr[mid + j + 1];
	}

	leftSide[numberOfLeftSide] = 999;
	rightSide[numberOfRightSide] = 999;

	i = j = 0;

	for (k = low; k <= high; k++)
	{
	    if (leftSide[i] <= rightSide[j])
	    {
		arr[k] = leftSide[i];
		i++;
	    }
	    else
	    {
		arr[k] = rightSide[j];
		j++;
	    }
	}
    }

}
