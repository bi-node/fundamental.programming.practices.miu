package package1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;




public class ArraySearchTest {
	int[] arr= {5,6,7,3,2};
	int target=5;
	@Test
	//Test No. 1
	public void testFirstElement() {
		int test1=0;
		int index=ArraySearch.search(arr,target);
		assertTrue(test1==index);	
}
	@Test
	//Test No. 2
	public void testLastElement() {
		int test2=arr.length-1;
		int index=ArraySearch.search(arr,target);
		assertTrue(test2==index);
}
	@Test
	//Test No. 3
	public void testSomewhereinMiddle() {
		int test3=arr.length-1;
		int index=ArraySearch.search(arr,target);
		assertTrue(test3==index);
}
	@Test
	//Test No. 4
	public void nointhearray() {
		int test4=-1;
		int index=ArraySearch.search(arr,target);
		assertTrue(test4==index);
}
	@Test
	//Test No. 5
	public void morethanoneoccurance() {
		int test5=4;
		int index=ArraySearch.search(arr,target);
		assertTrue(test5==index);
}
	@Test
	//Test No. 6
	public void arrayhasnoelement() {
		int test6=0;
		int index=arr.length;
		assertTrue(test6==index);
}
}
