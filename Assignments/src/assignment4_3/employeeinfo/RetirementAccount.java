package assignment4_3.employeeinfo;

public class RetirementAccount extends Account{
	RetirementAccount(Employee employee, double balance) {
		super(employee, balance);
		
		System.out.println("Constructor of retirement accout");
		// TODO Auto-generated constructor stub
	}

	public double getBalance()
	{
		return balance;
	}


}
