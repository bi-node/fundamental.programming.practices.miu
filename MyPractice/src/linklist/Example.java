package linklist;

import java.util.*;

import org.hamcrest.collection.IsEmptyCollection;



public class Example {
	public static void main(String[] args) {
		//Collection<Integer> coll = new ArrayList<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		list.add(67);
		list.add(0,7);
		
		System.out.println(list);
		System.out.println(	list.contains(7));   //check whether there is that elemetn
		System.out.println(	list.contains(5));
		System.out.println(list.isEmpty());

		
		
		
		

	}

}
