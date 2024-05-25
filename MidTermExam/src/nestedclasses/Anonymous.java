package nestedclasses;

class TopClass{
	public TopClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Top Class constructor");
	}
}

public class Anonymous {
		public Anonymous() {
			// TODO Auto-generated constructor stub
			System.out.println("Main class constructor");

		}
		public void display()
		{
			System.out.println("Main class method");
		}
    public static void main(String[] args) {

        // Creating an anonymous inner class that implements the Greeting interface
        TopClass anonymousGreeting = new TopClass() {
            
        };
        Anonymous cc=new Anonymous() {
        	@Override
        	public void display()
        	{
        		System.out.println("Anonymus class method");
        	}
        	
        };
        
        cc.display();

        // Invoking the greet method of the anonymous inner class
     
    }
}