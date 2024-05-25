package assignment4_5.closedcurve.good;

public class Rectangle extends ClosedCurve implements Polygon{
	
	@Override
	public double[] getArrayOfSides() {
		double[] arr= {width, width, length, length};
		return arr;
		
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
