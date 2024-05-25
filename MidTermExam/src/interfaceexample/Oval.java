package interfaceexample;

public class Oval implements ClosedCurve{

	@Override
	public double computeArea() {
		double defaultRadius=ClosedCurve.y;
		return pi*defaultRadius*5;
	}

}
