package assignment2;

public class Prog2_5Reverse{
    public static void main(String[] args) {
        String s="Hello";
        int lenght=s.length()-1;
        while(lenght>=0)
        {
            System.out.println(s.charAt(lenght));
            lenght--;

        }
    }
}
