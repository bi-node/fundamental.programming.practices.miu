package assignment4_4.closedcurve.good;

import javax.sound.midi.Soundbank;
import javax.sql.rowset.serial.SQLOutputImpl;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.hamcrest.core.IsInstanceOf;
import org.w3c.dom.ls.LSOutput;

public class Test2 {
	public   int getNumberOfSides() {
		
		//default public abstract
		return 0;
	}
	 public  double computePerimeter() {
		return 0;
		 
		 
	 }
	public static void main(String[] args) {
		
		Polygon[] polygons= {new Rectangle(3, 4), new Triangle(4, 5, 6), new Square(3)};
		//getting information of class
		//to get class info
		//Class class1=polygons.getClass();
		//to get class name
		//String className=polygons.getClass().getSimpleName();
		for(Polygon d: polygons)
		{
			if(d instanceof Square) {
				System.out.println("For this square");
				System.out.println("\tNumber of side: "+ d.getNumberOfSides());
				System.out.println("\tPerimeter: = "+d.computePerimeter());
			}
		}
		for(Polygon d: polygons)
		{
			if(d instanceof Rectangle) {
				System.out.println("For this Rectangle");
				System.out.println("\tNumber of side: "+ d.getNumberOfSides());
				System.out.println("\tPerimeter: = "+d.computePerimeter());
			}
		}
		for(Polygon d: polygons)
		{
			if(d instanceof Triangle) {
				System.out.println("For this Triangle");
				System.out.println("\tNumber of side: "+ d.getNumberOfSides());
				System.out.println("\tPerimeter: = "+d.computePerimeter());
			}
		}
		
		
		
	}

}
