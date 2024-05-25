package assignment4_2closedcurve.good;

public final class Circle extends ClosedCurve {
	private final double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		System.out.print("\nThe area of Circle is: ");
		return (Math.PI * radius * radius);
	}
}
