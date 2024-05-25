
import java.util.Arrays;


public class ArraysDemo {
	public static void main(String[] args) {
		String[] arr= {"Kratos", "Micheal", "Trevor", "Nathan", "Bruce"};
		int[] intarr= {74,2,56,21,42};
		ArraysDemo arraysDemo=new ArraysDemo();
		arraysDemo.sortString(arr, intarr);
		System.out.println("Sorted Arrays "+Arrays.toString(intarr));
		
		
	}
	public void sortString(String[] arr, int[] intarr)
	{
		System.out.println("First two element of array");
		String[] arr1=Arrays.copyOf(arr,2);
		for(String p:arr1)
			System.out.println(p);
		
		Arrays.sort(intarr);
		
		
	}

}
