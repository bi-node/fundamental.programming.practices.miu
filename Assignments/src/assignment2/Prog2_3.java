package assignment2;

public class Prog2_3 {
    public static void main(String[] args) {
        float a=1.27f;
        float b= 3.881f;
        float c= 9.6f;
        int d=(int)(a+b+c);
        System.out.println("Sum by type casting: "+ d);
        d=Math.round(a)+Math.round(b)+Math.round(c);
        System.out.println("Sum by Math.rounding: "+d);


    }

}
