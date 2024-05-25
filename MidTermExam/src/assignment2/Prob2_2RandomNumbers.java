package assignment2;

import java.util.Random;

public class Prob2_2RandomNumbers {
	public static void main(String[] args) {
		Random random=new Random();
		//System.out.println(random.nextInt(6)+1);

		//System.out.println(Prob2_2RandomNumbers.getRandomRange(5, 11));
		
		double rand=Math.random();
		System.out.println((int)(rand*6)+1);
		
	}
	
	public static int getRandomRange(int min, int max)
	{
		Random x=new Random();
		if(min>max && min==max) return 0;
		
		int start=max-min;
		int rand=x.nextInt(start);
		
				rand+=min;
		
		return rand;
		
		
	}

}
