package interfaceexample;


public interface ClosedCurve {
	static final double pi=3.1415;
	static  double x=6;
	final double y=5;
	double computeArea();

	default double  incrementer()
	{
		
		return 1;
	}
	static String display()
	{
		
		return "The area of ";
	}
	

}
