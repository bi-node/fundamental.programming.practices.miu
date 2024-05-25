package assignment4_2closedcurve.good;

public class Rectangle extends ClosedCurve {
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
