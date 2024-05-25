package assignment2;

import java.util.Random;

public class Prog2RandomNumber {
    public static void main(String[] args) {
        double pi=Math.PI;
        /*//first question
        double random=Math.random();
        int randomnum=(int)(random*9+1);
        System.out.println("The vaue of Pi power random number is: "+Math.pow(pi,randomnum));

        //second question random number between 3 and 14
        int range = 14-3;
        random=Math.random();
        randomnum=(int)(random*range+3);
        System.out.println("Random number between 3 and 14 is: "+randomnum);
        */
        System.out.println(RandomNumbers.getRandomInt(1,10));



    }


}
