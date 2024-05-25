package employeeinfo;

public class SavingAccount extends Account{
	
	public SavingAccount(Employee e, double balance) {
		super(e, balance);
		
	}
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (0.25/100)*baseBalance;
		return baseBalance + interest;
		}

}
