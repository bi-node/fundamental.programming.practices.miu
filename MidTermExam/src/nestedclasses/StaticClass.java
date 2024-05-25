package nestedclasses;



public class StaticClass {
	static int x=10;
	static void outerDisplay()
	{
		System.out.println("This is outer class");
	}
	//start of innerclass
	static  class InnerClass{
		 int y=20;
		 void innerDisplay()
		{
			System.out.println(y+x);  //inner static class can access outer class variable and method
			//if only the outer calss field/methods are sattic. 
			outerDisplay();
			System.out.println("this is inner class");
		}
		
		
	}
	//end of innerclass
	public static void main(String[] args) {
		StaticClass.InnerClass sc=new StaticClass.InnerClass();
		sc.innerDisplay();
		
		
		
	}

}
