package employeeinfo;

class Account {


	private double balance;
	private Employee employee;
	Account(Employee employee)
	{
		this.employee=employee;
	}

	Account(Employee employee, double balance) {
		this.employee = employee;
		this.balance = balance;
	}

  public String toString() {
  		  
	  return String.format("Current Bal: \t %.2f",  balance);
 }
  public double getBalance()
  {
	  return this.balance;
  }
  public void setBalance(double balance)
  {
	  this.balance=balance;
  }

	public void makeDeposit(double deposit) {
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (amount > this.balance)
			return false;
		else {
			this.balance -= amount;
			return true;
		}
	}
}
