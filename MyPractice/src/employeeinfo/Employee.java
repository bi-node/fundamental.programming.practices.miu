package employeeinfo;


import java.time.LocalDate;

public class Employee {
	private AccountList account;
	private String name;
	private LocalDate hireDate;
	private MyString accountType;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		this.account = new AccountList(); // Initialize the AccountList
		this.accountType = new MyString();

	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	public MyString getAccoutType()
	{
		return accountType;
	}

	public void createNewChecking(double startAmount) {

		if (accountType.find(AccType.CHECKING.toString())) {
			System.out.println("\n" + this.name + "  Checking Account Already Created, Thank you");
		} else {
			Account acct = new CheckingAccount(this, startAmount);
			// accounts is the name of the AccountList variable
			account.add(acct);
			accountType.add(AccType.CHECKING.toString());
			;
		}
	}

	public void createNewSavings(double startAmount) {
		if (accountType.find(AccType.SAVING.toString())) {
			System.out.println("\n" + this.name + "  Saving Account Already Created, Thank you");
		} else {
			Account acct = new SavingAccount(this, startAmount);
			// accounts is the name of the AccountList variable
			account.add(acct);
			accountType.add(AccType.SAVING.toString()); // adding account type in MyString
		}
	}

	public void createNewRetirement(double startAmount) {
		if (accountType.find(AccType.RETIREMENT.toString())) {
			System.out.println("\n" + this.name + "  Retirement Account Already Created, Thank you");
		} else {
			Account acct = new RetirementAccount(this, startAmount);
			//RetirementAccount acct=new RetirementAccount(this, startAmount);
			// accounts is the name of the AccountList variable
			account.add(acct);
			accountType.add(AccType.RETIREMENT.toString());
		}
	}

//	public void deposit(int accountIndex, double amt) {
//			
//		Account selected = account.get(acctIndex);
//		selected.makeDeposit(amt);
//
//	}
//
//	public boolean withdraw(int accountIndex, double amt) {
//
//		String choice = accountIndex == 1 ? AccType.CHECKING.toString()
//				: accountIndex == 2 ? AccType.SAVING.toString() : AccType.RETIREMENT.toString();
//
//		return false;
//
//	}

//		
//		
//		Account selected = account.get(accountIndex);
//		selected.makeWithdrawal(amt);
//		if (selected.makeWithdrawal(amt) == false)
//			System.out.println("Insufficient Funds");
//		return false;
//	}

	public String getFormattedAcctInfo() {
		if (this.account == null)
			return "";
		else {
			account.toString1();
			return "";
		}

	}

}