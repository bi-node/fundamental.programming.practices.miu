package recursion;

public class SumofArray {
	public static void main(String[] args) {
		SumofArray soa=new SumofArray();
		int[] arr= {3,65,2,4,63,56,8};
		System.out.println(soa.sumofArray(arr,arr.length));
		
	
	}
	//sum of array
	public int sumofArray(int[] a, int len)
	{
		if(len<=0) return 0;
		else {
				
			return a[len-1]+ sumofArray(a, len-1);
		}
	}

}
