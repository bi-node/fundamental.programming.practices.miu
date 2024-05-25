package recursion;

public interface DecimalToBinary {
	public static void main(String[] args) {
		System.out.println(dTob(24));
	}
	public static int dTob(int n)
	{
		if(n==0) return 0;
		else {
			int rem=n%2;
			return dTob(n/2)*10+rem;
		}
		
	}

}
