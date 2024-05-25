package assignment4_1;

import java.time.LocalDate;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Main {
	public static void main(String[] args) {
		
		Professor pf1=new Professor("Ankur Yat", LocalDate.of(2021, 10, 10), 50000, 10);
		Professor pf2=new Professor("John Hagelin", LocalDate.of(2001, 05, 10), 90000, 10);
		Professor pf3=new Professor("Jeffory Cohen", LocalDate.of(2014, 11, 24), 9000, 10);
		Secretary s1=new Secretary("Sabina Lagun", LocalDate.of(2018, 05, 25), 3500, 200);
		Secretary s2=new Secretary("Binod Rasaili", LocalDate.of(2023, 05, 18), 3000, 200	);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0]=pf1;
		department[1]=pf2;
		department[2]=pf3;
		department[3]=s1;
		department[4]=s2;
		
		System.out.println("Do you wish to see sum of all salaries: (Y/N)");
		Scanner scanner=new Scanner(System.in) ;
		String s=scanner.nextLine();
	
		if(s.toUpperCase().equals("Y"))
			{
					double  totalSalary=0;
					for(int i=0; i<department.length; i++)
					{	
						totalSalary=totalSalary+department[i].computeSalary();
						
					}
					
					System.out.println("The total salary of the Department is: "+totalSalary);
			}
		else {
			System.out.println("Its ok..Good Bye");
		}
		
		scanner.close();
	}

}
