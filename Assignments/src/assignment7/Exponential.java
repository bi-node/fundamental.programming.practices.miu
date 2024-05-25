package assignment7;

public class Exponential {
	public static void main(String[] args) {
			Exponential exp=new Exponential();
			System.out.println(exp.power(4, 3));
	}

	
	
	
	double power(double x, int n)
	{
		if(n<=0) return 1;
		else {
			return x*power(x, n-1);
		}
		
	}

}
