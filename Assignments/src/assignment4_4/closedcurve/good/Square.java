package assignment4_4.closedcurve.good;

public final class Square extends ClosedCurve implements Polygon {
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		double perimeter=4*side;
		return perimeter;
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
