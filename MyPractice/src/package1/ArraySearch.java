package package1;

public class ArraySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	
	}
	public static int search(int[] arr, int target)
	{
	
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==target)
				return i;
		}
		return -1;
		
	}

}
