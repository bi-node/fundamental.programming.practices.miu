package nestedclasses;

public class Local {
	int x = 10;

	public void display() {
		
		class LocalInner {
			int x = 30;

			void sum(int x) {
				System.out.println("The value of local x " + Local.this.x);
				System.out.println("The value of class  x " + this.x);
				System.out.println("The value of arguments  x " + x);
				
				System.out.println("The sum is: " + (x+this.x+Local.this.x));
			}

		}
		LocalInner loc=new LocalInner();
		loc.sum(60);
	}
	
	public static void main(String[] args) {
		
		Local local=new Local();
		local.display();
		
		
		
	}

}
