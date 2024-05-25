package assignment2.Prob2_4;

import java.util.Arrays;

public class Prog4 {
	public static void main(String[] args){
		String[] strings=Data.records.split(":");
		String[] nr;
		
		for(int i=0; i<strings.length;i++)
		{
			nr=strings[i].split(",");
			System.out.println(nr[0]);
		}
		
	}
}
	
