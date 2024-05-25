
public class MiniSort {
	public static void main(String[] args) {
		int[] arr = { 24, 23, 52, 1, 3, 5, 34, 5, 3, 524, -34 };
		System.out.println(sort(arr).toString());
	}
	
	static int[] sort(int[] arr)
	{
		int[] minArray=new int[arr.length];
		if(arr.length<=1) return arr;
		int minIndex=findSmallPos(arr);
		int minNos=arr[minIndex];
		int[] replacedArr=replace(arr, minIndex);
		return 
		
		
		
		return arr;
	}
	
	static int findSmallPos(int[] arr)
	{
		int minIndex=0;
		int minNo=arr[0];
		int temp;
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<minNo)
			{
				minIndex=i;
				minNo=arr[i];
			}
		}
		
		return minIndex;
		
	}
	
	static int[] replace(int[] arr, int repPos)
	{
		
		int[] arr1=new int[arr.length-1];
		System.arraycopy(arr, 0, arr1, 0, repPos);
		System.arraycopy(arr, repPos+1, arr1, repPos, arr.length-repPos);
		return arr1;	
		
	}

}
