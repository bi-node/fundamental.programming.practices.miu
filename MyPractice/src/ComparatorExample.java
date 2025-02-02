import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        // Initialize an array of Person objects
        Person[] people = {
            new Person("Alice", 25),
            new Person("Bob", 22),
            new Person("Charlie", 30)
        };

        // Sort the array based on age using a Comparator
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });

        // Display sorted array
        System.out.println("Sorted by Age:");
        Arrays.stream(people).forEach(System.out::println);
    }
}
