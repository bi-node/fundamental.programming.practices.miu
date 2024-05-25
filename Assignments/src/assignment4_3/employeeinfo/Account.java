package assignment4_3.employeeinfo;

class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	private Employee employee;
	// public AccountType accType;

	Account(Employee employee, double balance) {
		this.employee = employee;
		this.balance = balance;

	}

	public double getBalance() {
		return balance;
	}

	Account(Employee employee) {
		this(employee, DEFAULT_BALANCE);
	}

	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (balance < amount) {
			System.out.println("No No...you have insufficient Funds. YOU CAN'T !!!\n");
			return false;
		} else {
			balance -= amount;
			System.out.println(amount + " Dollars withdrawn" + " from  account of" + "Mr./Ms " + employee.getName());
			return true;
		}

	}
}
