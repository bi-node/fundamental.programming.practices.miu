package employeeinfo;

public class CheckingAccount extends Account {
	

	public CheckingAccount(Employee e, double balance) {
		super(e, balance);
	}
		
	public double getBalance() {
		double baseBalance = super.getBalance();
	
		return baseBalance -5 ;
		}
}
