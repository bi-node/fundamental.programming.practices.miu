package assignment4_3.employeeinfo;

public class SavingsAccount extends Account {

	 SavingsAccount(Employee employee, double balance) {
		super(employee, balance);
		// TODO Auto-generated constructor stub
	}
	
	public double getBalance()
	{
		return balance+=0.0025*balance;
	}

}
