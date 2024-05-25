import java.util.Arrays;

public class ReflectionLibrary {
	public static void main(String[] args) {
		String ab="hello";
		String xy="hi";
		String aB=new String("hello");
		System.out.println(ab.equals(aB));
		System.out.println(ab==aB);
		
		int[] aa= {23,23,5,52,32,43};
		System.out.println(Arrays.toString(aa));
		System.out.println(Arrays.toString(Arrays.copyOf(aa, 4)));


		
	}

}
