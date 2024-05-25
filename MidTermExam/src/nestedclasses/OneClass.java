package nestedclasses;



public class OneClass {
	private int x;
	private int y;
	public OneClass(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}

	// start of inner class
	 class MemberClass {
		int z;
		public MemberClass(int z) {
			// TODO Auto-generated constructor stub
			this.z=z;
		}
		private void sumDisplay()
		{
			int sum=x+y+z;
			System.out.println("The sum is "+sum);
		}
		
	 
	
		
	}
	//end of inner class
	
	
	public static void main(String[] args) {
		OneClass class1=new OneClass(6, 9);
		MemberClass mem=class1.new MemberClass(9);
		
		
		mem.sumDisplay();
		
		
	}

}
