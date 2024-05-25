package assignment3_1;

import java.time.LocalDate;


public class Employee {
	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private LocalDate hireDay;

	// constructor
	Employee(String name, String aNickName, double aSalary, int aYear,
			int aMonth, int aDay) {
		this.name = name;
		nickName = aNickName;
		salary = aSalary;
		LocalDate cal = LocalDate.of(aYear, aMonth , aDay);
		hireDay = cal;
	}

	// instance methods
	public String getName() {
		return name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String aNickName) {
		nickName = aNickName;
	}
	public double getSalary() {
		return salary;
	}
	// needs to be improved
	public LocalDate getHireDay() {
		return hireDay;
	}
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	private String format = "name = %s, salary = %.2f, hireDay = %s";
	
	public String toString() {
		return String.format(format, name, salary, hireDay);
	}
	
	///main class starts here
	public static void main(String[] args) {
		AccountType ch= AccountType.CHECKING;
		AccountType sav=AccountType.SAVINGS;
		AccountType ret=AccountType.RETIREMENT;
		Employee[] emp=new Employee[3];
		emp[0]=new Employee("Binod Rasaili", "Blondie", 200000, 1999, 10, 2);
		emp[1]=new Employee("Toyam Rasaili", "Nino", 150000, 2023, 1, 2);
		emp[2]=new Employee("Ram Bhandari", "Rame", 100000, 2019, 5, 2);
		Account[] accounts=new Account[8];
		accounts[0]=new Account(emp[0], ch,200000);
		accounts[1]=new Account(emp[1], ch,150000);
		accounts[2]=new Account(emp[2], ch,205000);
		accounts[3]=new Account(emp[0], ch,400000);
		accounts[4]=new Account(emp[1], ch,250000);
		accounts[5]=new Account(emp[0], ch,100000);
		accounts[6]=new Account(emp[1], ch,50000);
		accounts[7]=new Account(emp[2], ch,75000);
		for(Account a:accounts)
		{
			System.out.println(a.toString());
		}
		
	}
	
	
	
}
