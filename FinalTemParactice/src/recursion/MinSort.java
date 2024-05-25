package recursion;

import java.lang.module.FindException;

public class MinSort {
	public static void main(String[] args) {
		SumofArray soa=new SumofArray();
		int[] arr= {3,65,2,4,63,56,8};
		System.out.println(soa.sumofArray(arr,arr.length));
		
	
	}
	
	public void minSort(int[] arr)
	{
		int minPos=minPos(arr);
		int minValue=arr[minPos];
		mergearray(arr, minPos);
		
	}
	
	private void mergearray(int[] arr, int minIndex)
	{
		int[] arr1=new int[arr.length-1];
		System.arraycopy(arr, 0, arr1, 0, minIndex);
		System.arraycopy(arr, minIndex+1, arr1, minIndex, arr.length-minIndex-1);
		arr=arr1;
	}
	
	private int minPos(int[] arr)
	{
		int minIndex=0;
		int MinValue=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(MinValue<arr[i])
			{
				MinValue=arr[i];
				minIndex=i;
			}
		}
		return minIndex;
	}

}
