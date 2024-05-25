package iterator;

import java.util.Iterator;

public class Employeee implements Iterable<Employeee> {
	private String name;
	private double salary;
	

	public Employeee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	@Override
	public Iterator<Employeee> iterator() {
		// TODO Auto-generated method stub
		return new Employeee(this.name, this.salary);
	}
	
	private class EmployeeIterator implements Iterator<Employeee>
	{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Employeee next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
