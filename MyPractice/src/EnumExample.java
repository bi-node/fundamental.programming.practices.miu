// Enum representing different types of shapes
enum ShapeType {
    CIRCLE("Circle"),
    SQUARE("Square"),
    TRIANGLE("Triangle");

    private final String displayName;

    // Constructor for each enum constant
    ShapeType(String displayName) {
        this.displayName = displayName;
    }

    // Getter for the display name
    public String getDisplayName() {
        return displayName;
    }

    // Method to calculate the area for each shape type
    public double calculateArea(double... dimensions) {
        switch (this) {
            case CIRCLE:
                // Assuming dimensions[0] represents the radius of the circle
                return Math.PI * Math.pow(dimensions[0], 2);
            case SQUARE:
                // Assuming dimensions[0] represents the side length of the square
                return Math.pow(dimensions[0], 2);
            case TRIANGLE:
                // Assuming dimensions[0] and dimensions[1] represent the base and height of the triangle
                return 0.5 * dimensions[0] * dimensions[1];
            default:
                throw new UnsupportedOperationException("Unsupported shape type");
        }
    }
}

// Example usage of the ShapeType enum
public class EnumExample {
    public static void main(String[] args) {
        // Using the enum constants
        ShapeType circle = ShapeType.CIRCLE;
        ShapeType square = ShapeType.SQUARE;
        ShapeType triangle = ShapeType.TRIANGLE;

        // Displaying enum constant names and display names
        System.out.println("Enum Constant: " + circle.name() + ", Display Name: " + circle.getDisplayName());

        // Calculating areas for different shapes
        double circleArea = circle.calculateArea(5.0);  // Radius of 5.0
        double squareArea = square.calculateArea(4.0);  // Side length of 4.0
        double triangleArea = triangle.calculateArea(3.0, 6.0);  // Base of 3.0, height of 6.0

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Square Area: " + squareArea);
        System.out.println("Triangle Area: " + triangleArea);
    }
}
