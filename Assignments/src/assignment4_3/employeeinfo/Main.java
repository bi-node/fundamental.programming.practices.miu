package assignment4_3.employeeinfo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Employee[] emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(6000);
		emps[0].createNewRetirement(7000);
		emps[0].displayAccountList();
		
		//DIsplaying 
		Scanner scanner=new Scanner(System.in);
		String selection=scanner.nextLine();
		System.out.println("A. See a report of all accounts.\r\n"
				+ "B. Make a deposit.\r\n"
				+ "C. Make a withdrawal.\r\n"
				+ "Make a selection (A/B/C): ");
		if(selection.equalsIgnoreCase("A")) {}
		else if(selection.equalsIgnoreCase("B")) {}
		else { }
		

	}
}
