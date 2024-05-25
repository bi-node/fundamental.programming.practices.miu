package ConstructorsExample.abstractclassexample;

public class Main {
	public static void main(String[] args) {

		Polygon[] p = { new Rectangle(20, 5), new Square(8), new Triangle(3, 4, 5), new Square(9) };
		String string;

		for (Polygon pp : p) {
			string = String.format("The area of %s is %f", pp.getClass().getSimpleName(), pp.computeArea());
			System.out.println(string);

		}
		
	}
}
