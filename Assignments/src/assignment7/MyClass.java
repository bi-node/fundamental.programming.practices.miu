package assignment7;

import java.util.Random;

import assignment2.Prog7.RandomNumbers;

public class MyClass {
	public static void main(String[] args) {
		new MyClass();
	}
	public MyClass() {
		recurse("Binod");
		// TODO Auto-generated constructor stub
	}
	String recurse(String s)
	{
		if(s==null) return null;
		int r=RandomNumbers.getRandomInt();
		int n=s.length();
		if(r%2==0)
		{
			return recurse(s.substring(0,n/2));
		}
		else {
			return recurse(s.substring(n/2,n));
		}
	}

}
