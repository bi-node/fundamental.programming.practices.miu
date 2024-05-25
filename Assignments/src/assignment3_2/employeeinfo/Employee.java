package assignment3_2.employeeinfo;

import java.time.LocalDate;


public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		LocalDate localDate=LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		hireDate=localDate;
		savingsAcct=null;
		retirementAcct=null;
		checkingAcct=null;
	
	}
	
	public String getName()
	{
		return name;
	}

	
	public void createNewChecking(double startAmount) {
		// implement
		if(checkingAcct==null) {
					checkingAcct=new Account(this, AccountType.CHECKING, startAmount);
					System.out.println("Mr./Ms. "+name+"\tChecking Account Created successfully");}
		else System.out.println("\nChecking account Already created");
	}

	public void createNewSavings(double startAmount) {
		// implement
		if(savingsAcct==null) {
				savingsAcct=new Account(this, AccountType.SAVINGS,startAmount);
				System.out.println("Mr./Ms. "+name+"\tSaving Account Created successfully");}
		else System.out.println("\nSavings account Already created"+name);
		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		if(retirementAcct==null) {
					retirementAcct=new Account(this, AccountType.RETIREMENT, startAmount);
					System.out.println("Mr./Ms. "+name+"\tRetirement Account Created successfully");}
			
		else System.out.println("\nRetirement account Already created"+name);
		
	}
//.........................................................................................................
	//Getting formated info
	public String getFormattedAcctInfo() {
		// implement
		System.out.println("The account information of Mr./Ms."+name+" is: ");
		System.out.println(savingsAcct.toString());
		System.out.println(checkingAcct.toString());
		System.out.println(retirementAcct.toString());
		System.out.println("Date of Hire "+hireDate);
		return null;
		
		
	}
	
	//---------------------------------------------------------------------------------------
	//Deposit
	public void deposit(AccountType acctType, double amt){
		// implement
		switch(acctType) {
		case  CHECKING:
						checkingAcct.makeDeposit(amt);
						break;
		case SAVINGS:
						savingsAcct.makeDeposit(amt);
						break;
		case RETIREMENT:
						retirementAcct.makeDeposit(amt);
						break;
		default:
						System.out.println("Wrong Account type");
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		// implement
		switch(acctType) {
		case  CHECKING:
						checkingAcct.makeWithdrawal(amt);
						break;
		case SAVINGS:
						savingsAcct.makeWithdrawal(amt);
						break;
		case RETIREMENT:
						retirementAcct.makeWithdrawal(amt);
						break;
		default:
						return false;
		}
		return true;
	}

}
