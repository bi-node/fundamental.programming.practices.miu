package assignment2;
/*Create a class Prog3. Inside its main method, create float variables to store each of the
following numbers:
1.27, 3.881, 9.6
Output to the console the following two values:
1. the sum of the floats as an integer, obtained by casting the sum to type int
2. the sum of the floats as an integer, obtained by rounding the sum to the nearest
integer, using the Math.round function*/

public class Prob2_3Round {
	public static void main(String[] args) {
		float a=1.27f;
		float b=3.881f;
		float c=9.6f;
		float sum=a+b+c;
		System.out.println("Sum by casting int: "+(int)sum);
		sum=Math.round(sum);
		System.out.println("Sum by rounding : "+ sum);
	}

}
