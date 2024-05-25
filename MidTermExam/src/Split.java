import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String str="Hello! What are you doing. I love to have pizza, hamburger or lasana.";
		String[] splitStr=str.split("\\.|\\. ,| ");
		System.out.println("Splitted Array\n: "+Arrays.toString(splitStr));
	}

}
