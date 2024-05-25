package linklist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {
		List<String> javalist=new ArrayList<String>();
		javalist.add("Bob");
		javalist.add("Harry");
		Iterator<String> it=javalist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
