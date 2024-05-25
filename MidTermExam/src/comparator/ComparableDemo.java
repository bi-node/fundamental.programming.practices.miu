package comparator;

import java.util.Arrays;

public class ComparableDemo implements Comparable<ComparableDemo> {
    String name;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ComparableDemo(String name, double salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(ComparableDemo cd) {
        return Double.compare(this.salary, cd.getSalary());
    }

    public static void main(String[] args) {
        ComparableDemo[] demoArray = {
            new ComparableDemo("Binod", 5000),
            new ComparableDemo("Toyam", 3000),
            new ComparableDemo("Bijaya", 3200),
            new ComparableDemo("Santosh", 1200),
            // Add more ComparableDemo objects as needed
        };

        Arrays.sort(demoArray);

        for (ComparableDemo cd : demoArray) {
            System.out.println(cd.getName() + ": " + cd.getSalary());
        }
    }
}
