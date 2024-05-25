package employees;

import java.time.LocalDate;

public class Employee {
	private String name;
	private double salary;
	LocalDate hireDate;

	public Employee(String name, double salary, LocalDate hireDate) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
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

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}
	
	public static void main(String[] args) {
		Employee employee=new Employee("Binod Rasaili", 52000, LocalDate.of(1999, 10, 1));
		System.out.println(employee.toString());
	}
	

}
