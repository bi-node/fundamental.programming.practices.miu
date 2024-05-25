package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Employee implements Iterable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Iterator implementation
    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator();
    }

    // EmployeeIterator inner class
    private class EmployeeIterator implements Iterator<Employee> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < 1; // We have only one employee in this example
        }

        @Override
        public Employee next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            currentIndex++;
            return Employee.this;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove() method is not supported.");
        }
    }

    // toString method to provide a string representation of the Employee object
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Example main method to test the Employee class
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 50000.0);

        // Iterate over employees
        for (Employee employee : emp1) {
            System.out.println(employee);
        }
    }
}
