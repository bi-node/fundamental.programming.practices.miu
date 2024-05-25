package assignment4_2closedcurve.good;

public final class Square extends ClosedCurve {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		System.out.print("\nThe area of this square is: ");
		return side * side;
	}


}
