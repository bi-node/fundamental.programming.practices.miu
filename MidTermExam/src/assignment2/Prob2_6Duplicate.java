package assignment2;

import java.util.Arrays;

public class Prob2_6Duplicate {
	public static void main(String[] args) {
		String[] arr= {"horse", "dog", "cat", "horse","dog", "dog", "elephant"};
		removeDups(arr);
		
			
		}
	//start of function
	static void removeDups(String[] arr)
	{
		String[] arr1= new String[arr.length];
		int size=0;
		int flag;
		for(int i=0; i<arr.length; i++)
		{
			flag=1;
			for(int j=0; j<arr1.length; j++)
					{
								if(arr[i]==arr1[j])
								{
									flag=0;
									break;
								}
					}
				if(flag==1)
				{
							arr1[size++]=arr[i];
				}
			
			
				
			}
		
		int j=0;
		while(arr1[j]!=null)
		{
			System.out.println(arr1[j]);
			j++;
		}
		
	}
	
	//end of function

}		
	
	