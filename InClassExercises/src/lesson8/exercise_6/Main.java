package lesson8.exercise_6;

import java.util.*;

@SuppressWarnings({ "serial", "unused" })
public class Main {
	
	public static void main(String[] args) {
		List<String> list1 = dataList1();
		List<String> list2 = dataList2();
		List<String> list3 = dataList3();
		
		//Step 1: Sort each list
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
				
				
		//Step 2: Assemble the sorted lists into a single collection of lists
		 Collection<List<String>> collection = new ArrayList<>();
		 collection.add(list1);
		 collection.add(list2);
		 collection.add(list3);
		
		//Step 3: Sort the combined list using a Comparator. Declare that
		//listA comes before listB if the 0th element of A precedes the 0th
		//element of B. Then print the combined list to the console
		 
	}
	
	class ComparableName implements Comparable<ArrayList<String>>
	{

		@Override
		public int compareTo(ArrayList<String> o) {
			// TODO Auto-generated method stub
			List<ArrayList<String>> xx=new ArrayList<ArrayList<String>>();
		xx.
			return 
			return 0;
		}
		
	}

	
	private static List<String> dataList1() {
		return new ArrayList<String>() {
			{
				add("Joe"); add("Bill");add("Sue");
				add("Rob"); add("Mohammed");add("Steven");
			}
		};
	}

	private static List<String> dataList2() {
		return new ArrayList<String>() {
			{
				add("Rick"); add("Sally");add("Tom");
				add("George"); 
			}
		};
	}

	private static List<String> dataList3() {
		return new ArrayList<String>() {
			{
				add("Talia"); add("Richard");add("Chloe");
				add("Celine"); add("Zahra");add("Rod");
				add("Frank");
			}
		};

	}

}
