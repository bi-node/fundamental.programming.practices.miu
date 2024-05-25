package assignment7;

public class Power {
	public static void main(String[] args) {
		System.out.println(pow(2, 4));
		
	}
	
	public static int pow(int n, int p)
	{
		if(p==0) return 1;
		else {
			return n*pow(n, p-1);
		}
	}

}
