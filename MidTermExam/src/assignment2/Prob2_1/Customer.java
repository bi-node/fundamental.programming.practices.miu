package assignment2.Prob2_1;

public class Customer {
	private String firstName;
	private String secondName;
	private String socialSecurityNumber;
	private Address billingAddress;
	private Address shippingAddress;
	//getter methods
	public Customer(String firstname, String secondName, String socialSecurityNumber, Address  billingAddress, 
			Address shippingAddress) {
		// TODO Auto-generated constructor stub
		this.firstName=firstname;
		this.secondName=secondName;
		this.socialSecurityNumber=socialSecurityNumber;
		this.billingAddress=billingAddress;
		this.shippingAddress=shippingAddress;
	}
	
		public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}


	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	//to string method
	public String toString()
	{
		
		String string=String.format("[ %s, %s, SSN: %s]", firstName, secondName, socialSecurityNumber);
		return string;
	}
	
	public static void main(String[] args) {
		Address a2=new Address("North 4th Street", "Fairfield"	, "IOWA", "52557");
		Address a1= new Address("Lincoln Street", "Chicago", "Illonioi", "6464");
		Customer[] customers=new Customer[] {new Customer("Binod", "Rasaili", "243523442"	, a1, a2),
				new Customer("Shiva Prasad", "Lamsal", "234-234-234", a1, a2)};
		
		
		
		
		for(Customer c: customers)
		{
			if(c.getBillingAddress().getCity()=="Chicago")
			{
				System.out.println(c.toString());
			}
		}
		
					
	}
	
	
	
	
	

}
