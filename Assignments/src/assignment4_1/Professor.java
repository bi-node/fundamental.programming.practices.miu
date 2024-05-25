package assignment4_1;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
			private int numberOfPublications;
			
			public Professor(String name, LocalDate hired, double i, int numberOfPublicaton) {
				// TODO Auto-generated constructor stub
				super(name, hired, i);
				this.numberOfPublications=numberOfPublicaton;
				
				
			}

			public int getNumberOfPublications() {
				return numberOfPublications;
			}

			public void setNumberOfPublications(int numberOfPublications) {
				this.numberOfPublications = numberOfPublications;
			}
			
			@Override
			public double computeSalary() {
				return super.computeSalary()+10*numberOfPublications;
				
			}
	

}
