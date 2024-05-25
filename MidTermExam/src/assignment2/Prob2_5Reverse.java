package assignment2;

public class Prob2_5Reverse {
	public static void main(String[] args) {
		String string="Hello";
		for(int i=string.length()-1; i>=0; i--)
			System.out.print(string.charAt(i));
	}

}
