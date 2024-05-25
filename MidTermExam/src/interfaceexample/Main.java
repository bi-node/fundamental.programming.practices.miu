package interfaceexample;

public class Main {
	public static void main(String[] args) {
		
		ClosedCurve[] x= {new Circle(), new Oval()};
		
		for(ClosedCurve i: x)
		{
			System.out.println(ClosedCurve.display()+ i.getClass().getSimpleName());
			System.out.println(Math.ceil(i.computeArea()*i.incrementer()));
			
		}
		
		ClosedCurve y=new Circle();
		//System.out.println("The perimeter of Circle is"+y.computePerimeter());   does not work
		//we need to downcast
		Circle circle=(Circle) y;
		System.out.println("The periometer of Circle is "+circle.computePerimeter());
		
		
	}

}
