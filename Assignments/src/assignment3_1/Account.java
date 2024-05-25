package assignment3_1;

class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	private Employee employee;
	public AccountType accType; 

	Account (Employee employee, AccountType acctType, double balance) {
		this.employee = employee;
		this.balance = balance;
		this.accType=acctType;
	}

	Account(Employee employee, AccountType acctType) {
		this(employee, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		String empInfo=employee.toString();
		System.out.println(empInfo);
		
		return "type = " + accType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		balance+=deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(balance<amount)
		{
				System.out.println("No No...you have insufficient Funds. YOU CAN'T !!!\n");
				return false;}
		else {
			balance-=amount;
			return true;
		}
		
	}
}
