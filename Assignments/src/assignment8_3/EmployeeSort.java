package assignment8_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		new EmployeeSort();

	}

	public EmployeeSort() {
		Employee[] empArray = { new Employee("George", 60000, 1996, 11, 5), 
				new Employee("Dave", 50000, 2000, 1, 3),
				new Employee("Dave", 45000, 2001, 2, 7),
				new Employee("Harry", 45000, 2008, 2, 7),
				new Employee("Richard", 45000, 2001, 2, 7)};
		List<Employee> empList = Arrays.asList(empArray);
		
		System.out.println("Sorted by name: ");
		NameComparator nameComp = new NameComparator();
		Collections.sort(empList, nameComp);
		System.out.println(empList);
		
		System.out.println("Sorted by Salary");
		SalaryComarator salComp = new SalaryComarator();
		Collections.sort(empList, salComp);
		System.out.println(empList);
		
		System.out.println("Sorted by Date");
		HireDateComparator hireComp = new HireDateComparator();
		Collections.sort(empList, hireComp);
		System.out.println(empList);
		
		System.out.println("Equal check");
		System.out.println(empArray[2].equals(empArray[3]));   //should output true
		System.out.println(empArray[0].equals(empArray[1]));  //should be false
		

	}

}
