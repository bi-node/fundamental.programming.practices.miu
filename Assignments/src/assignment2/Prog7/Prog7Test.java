package assignment2.Prog7;
public class Prog7Test {
    public static void main(String[] args){
        String output = "";
        output = String.format("%16d %12d %n %n", 8, 10);
        output += String.format("%13s %2d %9s %2d %n","+", 9, "+", 10);
        output += String.format("%16s %12s","____", "____");
        System.out.println(output);
    }
}