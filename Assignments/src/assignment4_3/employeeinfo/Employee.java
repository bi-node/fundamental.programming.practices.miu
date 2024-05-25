package assignment4_3.employeeinfo;

import java.time.LocalDate;


public class Employee {

	
	private String name;
	private LocalDate hireDate;
	private AccountList accounts;
	private Account acc;
	
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		LocalDate localDate=LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		hireDate=localDate;
		accounts=new AccountList();
	}
	
	public String getName()
	{
		return name;
	}

	
	public void createNewChecking(double startAmount) {
		// implement
		 acc=new CheckingAccount(this, startAmount);
		 accounts.add(acc);
		 
				
	}

	public void createNewSavings(double startAmount) {
		// implement
		 acc=new SavingsAccount(this, startAmount);
		 accounts.add(acc);
		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		 acc=new RetirementAccount(this, startAmount);
		 accounts.add(acc);
		
	}
//.........................................................................................................
	//Getting formated info
	public String getFormattedAcctInfo() {
		return "";
		// implement
		
		
		
	}
	
	//---------------------------------------------------------------------------------------
	//Deposit
	public void deposit(double amt){
		// implement
		
	}
	public boolean withdraw( double amt){
		// implement
		return false;
	}
	
	public void displayAccountList()
	{
			Account[] acc=accounts.getAccounts();
			System.out.println(acc.length);
			for(int i=0; i<acc.length; i++)
				if(acc[i] instanceof CheckingAccount)
						System.out.println("Checking Account Balance"+acc[i].getBalance());
				else if(acc[i] instanceof RetirementAccount)
					System.out.println("Retirement  Account Balance"+acc[i].getBalance());
				else  System.out.println("Savings  Account Balance"+acc[i].getBalance());
						
	}
}
