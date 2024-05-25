package recursion;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sum(2345));
		
	}
	
	public static int sum(int n)
	{
		if(n==0) return 0;
		else {
			int an=n%10;
			return sum(n/10)+an;
		}
		
	}

}
