package comparator;

import java.util.Comparator;

import javax.sound.sampled.TargetDataLine;

import java.util.Arrays;

public class ComparatorName implements Comparator<Person>
{
	@Override
	public int compare(Person p2, Person p1)
	{
		return p1.getName().compareTo(p2.getName());
		
	}
	
	Person[] getData()
	{
		Person[] arr= {new Person("Binod", 4000), new Person("Toyam", 6000)};
		return arr;
		
	}
	
	public static void main(String[] args) {
		ComparatorName c=new ComparatorName();
		Person[] p=c.getData();
		Arrays.sort(p,new ComparatorName());
		System.out.println(Arrays.toString(p));
	}
}