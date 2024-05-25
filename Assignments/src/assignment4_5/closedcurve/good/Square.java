package assignment4_5.closedcurve.good;

public final class Square extends ClosedCurve implements Polygon {
	@Override
	public double[] getArrayOfSides() {
		double[] arr= {side, side, side,side };
		return arr;
	}
	
	
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		System.out.print("\nThe area of this square is: ");
		return side * side;
	}
	
	


}
