package ConstructorsExample.abstractclassexample;

public class Rectangle extends Polygon {
	 double side2;

	public Rectangle(double side1, double side2) {
		super(side1);
		this.side2=side2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method
		return side1*side2;
		
	}
	
	

}
