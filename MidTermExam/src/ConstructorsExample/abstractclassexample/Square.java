package ConstructorsExample.abstractclassexample;

public class Square extends Polygon {

	public Square(double side1) {
		super(side1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.pow(side1, 4);
	}

}
