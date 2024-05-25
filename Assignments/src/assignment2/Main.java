package assignment2;

public class Main {
    public static void main(String[] args) {
        Address[] address=new Address[5];
        address[0]=new Address("Burlington Eve", "Chicago", "Illinois", "42342");
        address[1]=new Address("Downtown", "Chicago", "Illinois", "3243");
        address[2]=new Address("Dwell street","Chicago", "Illinois", "324");
        address[3]=new Address("1000 North Street", "Fairfield", "Iowa", "42342");
        address[4]=new Address("CID", "Cedar Rapids", "Iowa", "52557");

        Customer c1=new Customer("Adam", "Smith", "F324434X");
        Customer c2=new Customer("Binod", "Rasaili", "H9043234");

        c1.setBillingAddress(address[0]);
        c1.setShippingAddress(address[1]);
        c2.setBillingAddress(address[2]);
        c2.setShippingAddress(address[3]);

       // System.out.println(" Home address: " + c1.getBillingAddress().toString());
        //System.out.println(" Work address: " + c1.getShippingAddress().toString());

        Customer[] cusarray=new Customer[2];
        cusarray[0]=c1;
        cusarray[1]=c2;

        for(int i=0; i<cusarray.length;i++)
        {
            String add=cusarray[i].getBillingAddress().getCity();
            if(add.equals("Chicago"))
            {
                System.out.println(cusarray[i].toString());
            }

        }











    }
}
