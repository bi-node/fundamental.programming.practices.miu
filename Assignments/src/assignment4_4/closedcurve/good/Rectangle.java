package assignment4_4.closedcurve.good;

public class Rectangle extends ClosedCurve implements Polygon{
	
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		double perimeter=2*(length+width);
		return perimeter;
	}
	
		double length;
		double width;
		public Rectangle(double width, double lenght)
		{
			this.length=lenght;
			this.width=width;
		}
		
		public double computeArea()
		{
			System.out.print("\nThe are of Rectangle is: ");
			 return length*width;
		}

		
		

}
