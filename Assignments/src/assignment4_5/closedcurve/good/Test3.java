package assignment4_5.closedcurve.good;



public class Test3 {

	public static void main(String[] args) {

		Polygon[] polygons = {new Triangle(4,5,6),
								 new Square(3), new Rectangle(3,4)};
		//compute areas

		double[ ] arr;
		for(Polygon p: polygons)
		{
			arr=p.getArrayOfSides();
			if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3])
			{
				System.out.println("For this Square");
				System.out.println("\tPerimeter :  "+Polygon.sum(arr));
			}
			else if(arr.length==4)
			{
				System.out.println("For this Rectangle");
				System.out.println("\tPerimeter :  "+Polygon.sum(arr));
			}
			else {
				System.out.println("For this Triangle");
				System.out.println("\tPerimeter :  "+Polygon.sum(arr));
			}
		}
		
		
		
		
	}
    

}
