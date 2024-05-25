package recursion7;

public class ReverseString {
	public static void main(String[] args) {
		ReverseString rev = new ReverseString();
		String string = "Binod";
		System.out.println(rev.reverse(string));
	}

	String reverse(String s) {
		if (s == null || s.length() == 0)
			return s;
		String first = "" + s.charAt(0);

		return reverse(s.substring(1)) + first;

	}

}
