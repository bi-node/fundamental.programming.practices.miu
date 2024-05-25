package comparator;

import java.util.Date;
import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2)
	{
		String name1=e1.getName();
		String name2=e2.getName();
		double sal1=e1.getSalary();
		double sal2=e2.getSalary();
		Date h1= e1.getHireDate();
		Date h2=  e2.getHireDate();
		if(h1.compareTo(h2) != 0) {
			return h1.compareTo(h2);
		}
		if(name1.compareTo(name2)!=0) return name1.compareTo(name2);
	
		else if(sal1==sal2) return 0;
		else if(sal1<sal2) return -1;
		else return 1;
			
		
		
	

}
}
