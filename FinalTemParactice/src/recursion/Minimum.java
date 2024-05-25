package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {42,5,53,53,23,2,5,0};
		findfreq(arr);
		

	}
	
	static void findfreq(int[] arr)
	{
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++)
		{
			map.put(arr[i], 1);
		}
		List<Integer> list=new ArrayList<Integer>();
		list=Arrays.ofLIst(arr);
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(map.get(it.next()));
		}
	}

}
