

public class CompareTodemo {
	public static void main(String[] args) {
		String aString="Making america";
		String bString="Great Again";
		String cString="making america";
		String yString="A";
		String z="B";
		String aString2="a";
		String appleString="apple";
		String bananaString="banana";	
		
		
		System.out.println("Is equal function: "+aString.equals(bString));
		System.out.println("Compare to function: "+aString.compareTo(bString));
		System.out.println("Comparing A and B: "+yString.compareTo(z));
		System.out.println("Comparing one string to itself: "+aString.compareTo(aString));
		System.out.println("Equaling to itself: "+bString.equals(bString));
		System.out.println("Comparing apple and banana: "+appleString.compareTo(bananaString));
		System.out.println("Comparing same text but different case: "+aString.compareTo(cString));
		System.out.println("Comparing different case letter: "+yString.compareTo(aString2));
		System.out.println("Making all capitals :"+aString.toUpperCase());
		System.out.println("Making all small letter :"+bString.toLowerCase());
		System.out.println("Comparing with ignore case: "+aString.compareToIgnoreCase(cString));
		
		
	}

}
