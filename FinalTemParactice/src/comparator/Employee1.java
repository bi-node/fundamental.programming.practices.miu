package comparator;

import java.util.Arrays;

//Employee1 class
class Employee1 {
 private String name;
 private double salary;

 public Employee1(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 public String getName() {
     return name;
 }

 public double getSalary() {
     return salary;
 }

 @Override
 public String toString() {
     return "Employee1 [name=" + name + ", salary=" + salary + "]";
 }
}

//SalaryComparable class implementing Comparable
class SalaryComparable implements Comparable<Employee1> {
 

@Override
public int compareTo(Employee1 o) {
	// TODO Auto-generated method stub
	eturn Double.compare(emp1.getSalary(), emp2.getSalary());
}
}

public class Main {
 public static void main(String[] args) {
     Employee1[] Employee1s = {
         new Employee1("Alice", 60000),
         new Employee1("Bob", 45000),
         new Employee1("Charlie", 70000)
     };

     // Sorting Employee1s array using Comparable
     Arrays.sort(Employee1s, new SalaryComparable());

     // Printing sorted Employee1s
     for (Employee1 emp : Employee1s) {
         System.out.println(emp);
     }
 }
}
