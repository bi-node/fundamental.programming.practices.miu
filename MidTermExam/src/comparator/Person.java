package comparator;

public class Person {
	String name;
	double salary;
	public Person(String name, double salary) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.salary=salary;
		
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
	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary +"";
	}
	
	
}
