
public class Fibonacci {
	public static void main(String[] args) {
		
		Fibonacci fb=new Fibonacci();
		System.out.println(fb.findFibo(5));
		
	}
	
	public int findFibo(int n)
	{
		if(n<=1) return n;
		int t1=0;
		int t2=1;
		int t3;
		for(int i=1; i<n; i++)
		{
			t3=t1+t2;
			t1=t2;
			t2=t3;
		}
		
		return t2;
	}
	

}
