package assignment2;

import java.util.Random;

import javax.sound.midi.Soundbank;

public class Prob2_7 {
	
	public  String toString()
	{
		StringBuilder stringBuilder=new StringBuilder();
		String numSet= "    "+getRandomNumbers()+"\n"+"+   "+getRandomNumbers()+"\n__________";
		return numSet;
	}
	
	public static int getRandomNumbers()
	{
		Random random=new Random();
		int randNo= random.nextInt(100)+1;
		return  randNo;
		
	}
	
	
	public static void main(String[] args) {
		
		Prob2_7 ob=new Prob2_7();
		for(int i=1; i<=3; i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print("\t"+ob.toString());
				
			}
			System.out.println("\n");
			
		}
		
		
	}

}
