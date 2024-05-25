import java.util.Arrays;

public class StringBuilderexam {
	public static void main(String[] args) {
		
		String a="Hello, What is the matter with you. I've been telling, that its been a fine day."
				+ "It's it?";
		String[] splita=a.split("\\. |\\.|' |, | ");
		System.out.println("The Splitted string is\n"+Arrays.toString(splita));
		
		StringBuilderexam aBuilderexam=new StringBuilderexam();
		String aString=aBuilderexam.display(splita);
		System.out.println(aString);
		
	}
	
	public  String display(String[] arr)
	{
		
		StringBuilder aBuilder=new StringBuilder();
		for(String i: arr)
		{
			aBuilder.append(i);
		}
		return aBuilder.toString();
	}
	
	

}
