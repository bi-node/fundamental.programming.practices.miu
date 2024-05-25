package assignment3_2.employeeinfo;


public enum AccountType  {
	 CHECKING("Checking"), SAVINGS("Savings"), RETIREMENT("Retirement");
	
	private final String displayName ;
	
	  AccountType(String displayName) {
		this.displayName=displayName;
	  }
		
		public String getDisplayName()
		{
			return this.displayName;
		}
		
}
