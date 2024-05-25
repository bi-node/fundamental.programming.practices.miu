package assignment4_5.case1;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		 GregorianCalendar date1 = new GregorianCalendar(2022, 2, 3);
		 GregorianCalendar date2 = new GregorianCalendar(1990, 2, 11);
		 GregorianCalendar date3 = new GregorianCalendar(1987, 5, 22);
		 GregorianCalendar date4 = new GregorianCalendar(1984, 2, 13);
		 
		Person p1=new Person("Binod Rasaili", date1);
		Person p2=new Person("Binod Rasaili", date1);
		PersonWithJob  p3=new PersonWithJob("Binod Rasaili", date1,4534);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		
		// TODO Auto-generated method stub

	}

}
