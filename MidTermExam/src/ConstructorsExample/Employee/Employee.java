package ConstructorsExample.Employee;

import java.time.LocalDate;

public class Employee {
	protected String name;
	private double salary;
	private LocalDate hireDate;
	public Employee(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		System.out.println(" Constructors of employee");
	}
	

}
