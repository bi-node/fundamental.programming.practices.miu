package interfaceexample;



public class Circle implements ClosedCurve {

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		double defaultRadius=ClosedCurve.x;
		return ClosedCurve.pi*Math.pow(defaultRadius, 2);
	}
	
	double  computePerimeter()
	{
		double defaultRadius=ClosedCurve.x;
		return 2*pi*defaultRadius;
	}
	public double incrementer()
	{
		return 1;
		
	}
	

}
