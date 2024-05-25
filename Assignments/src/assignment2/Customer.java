package assignment2;

public class Customer {
    private String firstName;
    private String lastName;
    private String social_security_number;

    Address shippingAddress;
    Address billingAddress;
    public Customer(String firstName, String lastName, String social_security_number)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.social_security_number=social_security_number;

    }

    public String getFirstName() {
        return firstName; }

    public String getLastName() {
        return lastName;
    }

    public String getSocial_security_number() {
        return social_security_number;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }
    public String toString()
    {
        return "["+firstName+","+lastName+", SSN: "+ social_security_number+"]";
    }
}
