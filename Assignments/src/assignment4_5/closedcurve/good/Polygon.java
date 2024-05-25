package assignment4_5.closedcurve.good;

public interface Polygon {

	//returns in an array all sides of the polygon
	 //example: For a rectangle, return would be [width, width,
	 // length, length]
	 public double[] getArrayOfSides();
	 
	 //returns the value of sum in arr
	 public static double sum(double[] arr) {
		double s=0;
		for(double i:arr)
		{
			s+=i;
		}
		return s;
		 
	 }
	//returns the perimeter of the polygon
	 default double computePerimeter() {
		 
		return 0;
		
		 
	 }
	

	

}
