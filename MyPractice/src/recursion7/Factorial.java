package recursion7;

public class Factorial {
	public static void main(String[] args) {
		Factorial f=new Factorial();
		System.out.println(f.factorial(5));
		System.out.println(f.factorial(0));
		System.out.println(f.factorial(20));
		
	}
	
	int factorial(int n)
	{
		if(n==0 || n==1) return 1;
		else {
			{
				return n*factorial(n-1);
			}
		}
		
	}

}
