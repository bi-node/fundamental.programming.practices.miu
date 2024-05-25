package recursion;

public class Reverse {

	
	public String reverse(String s) {
		
		if(s.length()>0) 
		{
			return reverse(s.substring(1))+s.charAt(0);
		}
		else {
			return s;
		}
		
	}
	
	public static void main(String[] args) {
		Reverse reverse=new Reverse();
		System.out.println(reverse.reverse("Binod"));
		
		
	}

}
