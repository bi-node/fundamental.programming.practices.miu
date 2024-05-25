package BuiltInList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;

public class LinkList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=10; i<50; i+=Math.random()*5)
		{
			list.add(i);
		}
		
		//throught loops
//		LinkList l=new LinkList();
//		l.IterLoops(list);
		
		//throught Iterator
		
		Iterator<Integer> il=list.iterator();
		Integer next=null;
		
		while(il.hasNext())
		{
			System.out.print(il.next()+" ");
		}
		System.out.println("\n");
		//throught for each
		for(Integer l: list)
		{
			System.out.print(l+" ");
			
		}
	//throught custom for each lamda expression
		System.out.println("Through lamda");
		list.forEach(name-> System.out.println(name));
		
		
		
	}
	
	//Throught loops
public Integer IterLoops(List<Integer> list)
{
	for(int i=0; i<list.size(); i++)
	{
		System.out.print(list.get(i)+" " );
	}
	return null;
	
}

}
