package assignment4_1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
			
			private double overTimeHours;
			public Secretary(String name, LocalDate hired, double i, int overTimeHours) {
				// TODO Auto-generated constructor stub
				super(name, hired, i);
				this.overTimeHours=overTimeHours;
				
				
			}
			
			
			public double getOverTimeHours() {
				return overTimeHours;
			}


			public void setOverTimeHours(double overTimeHours) {
				this.overTimeHours = overTimeHours;
			}

			@Override
			public double computeSalary() {
				return super.computeSalary()+12*overTimeHours;
				
			}

}
