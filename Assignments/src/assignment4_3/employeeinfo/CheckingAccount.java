package assignment4_3.employeeinfo;

public class CheckingAccount extends Account {

	CheckingAccount(Employee employee, double balance) {
		super(employee, balance);
		System.out.println("Constructor of Checking account");
		// TODO Auto-generated constructor stub
	}
	
	public double getBalance()
	{
		return balance-=5;
	}

}
