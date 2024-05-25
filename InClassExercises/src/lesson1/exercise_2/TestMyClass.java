package lesson1.exercise_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import lesson1.exercise_1.MyClass;

public class TestMyClass {
	@Test
	public void testProduct() {
		int expected=-330;
		int arr[]={2, 5, -3, 11, 1};
		int result=MyClass.product(arr);
		assertEquals(expected,result);
		
	
	}
	
	@Test
	public void testConcatenate() {
		String[] str= {"Almost"," ", "Done"};
		String expected="Almost Done";
		String result=MyClass.concatenate(str);
		assertEquals(expected, result);
	
	
	}
	
}
