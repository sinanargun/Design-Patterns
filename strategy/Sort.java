/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sinan
 */
public class Sort
{

    private SortType sortType;

    public Sort(SortType sortType)
    {
	this.sortType = sortType;
    }

    public void changeStrategy(SortType sortType)
    {
	this.sortType = sortType;
    }

    public void goToSort(int[] arr)
    {
	sortType.sort(arr);
    }
}
