package employeeinfo;

public class RetirementAccount extends Account {
	
	public RetirementAccount(Employee e, double balance) {
		super(e, balance);

	}
	/*
	 * (when a withdrawal is made from a retirement account, a 2% penalty is applied
	 * to the balance
	 */

	public boolean makeWithdrawal(double amount) {
		double baseBalance = super.getBalance();
		if (amount > baseBalance)
		{ System.out.println("Not enough funds");
			return false;
		}
		else {
					baseBalance=baseBalance -amount-0.02*baseBalance;
			super.setBalance(baseBalance);
			return true;
		}
	}
		
		
		
}
