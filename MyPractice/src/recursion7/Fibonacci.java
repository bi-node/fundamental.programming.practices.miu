package recursion7;

public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		for(int i=1; i<10; i++)
			System.out.print(fib.fibonacci(i)+", ");

	}
	
	int fibonacci(int n)
	{
		if(n<=1) return 1;
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}

}
