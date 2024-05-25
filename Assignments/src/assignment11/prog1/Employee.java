package assignment11.prog1;

import java.util.HashMap;
import java.util.Iterator;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord=new HashMap<String, Double>();

	
	public void addEntry(String date, double salary) {
		//implement
		salaryRecord.put(date, salary);
	}
	public void printPaymentAmount(String date) {
		//implement
		if(!salaryRecord.containsKey(date) )
			System.out.println("Record Not Found");
		else {
			System.out.println("The payment amount of: "+date+" is "+salaryRecord.get(date));
		}
		
		
	}
	public void printAveragePaycheck() {
		//implement
		double sum=0;
		for(double salary: salaryRecord.values())
		{
			sum+=salary;
		}
		System.out.println("The avearge salary is "+ sum/salaryRecord.size());
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
