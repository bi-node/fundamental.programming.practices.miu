package assignment5.assignment5_2;

import assignment5.assignment5_2.Top.Middle.Bottom;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	public Top() {
		// TODO Auto-generated constructor stub
		mid=new Middle();
		midbot=mid.new Bottom();
		
	}
	//returns the value in the instance variable of Bottom
	int readBottom() {
		//return the instance variable of buttom class
		return midbot.b;
				
		
	}
	class Middle {
		int m = 2;
		
		//returns sum of instance vble in Top and 
		//instance vble in Bottom
		public int addTopAndBottom() {
			//implement
			int sum;
			Top top=new Top();
			sum=midbot.b+top.t;
			return sum;
		}
		class Bottom {
			int b = 3;
			//returns the product of the instance vbles
			//in all three classes
			int multiplyAllThree() {
				//implement
				int prod=b*mid.m*Top.this.t;
				// prod=b*t*m;
				return prod;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();

		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());

	}

}