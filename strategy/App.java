
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sinan
 */
public class App
{

    public static void main(String args[])
    {

	int[] inputArr =
	{
	    141, 84, -38, 131, -10, 92, 59, 30, -6, 82
	};

	Sort sort = new Sort(new MergeSort());

	sort.goToSort(inputArr);
	print(inputArr);

	int[] inputArr2 =
	{
	    141, 84, -38, 131, -10, 92, 59, 30, -6, 82
	};
	sort.changeStrategy(new SelectionSort());

	sort.goToSort(inputArr2);
	print(inputArr2);

    }

    private static void print(int[] arr)
    {

	for (int i : arr)
	{
	    System.out.print(i + " ");
	}
	System.out.println("\n");
    }

}
