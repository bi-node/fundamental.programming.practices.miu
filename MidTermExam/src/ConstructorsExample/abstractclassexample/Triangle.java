package ConstructorsExample.abstractclassexample;

public class Triangle extends Polygon{
	double side3;
	double side2;

	public Triangle(double side1, double side2, double side3) {
		super(side1);
		this.side2=side2;
		this.side3=side3;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return side1*side2*side3/3;
	}

}
