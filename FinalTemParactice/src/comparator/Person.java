package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person otherPerson) {
		// Compare based on age
		return Integer.compare(this.age, otherPerson.age);
	}

	// Example usage
	public static void main(String[] args) {
		Person[] person = {new Person("Alice", 30),
		new Person("Bob", 25)};

		// Comparing persons
//		if (person1.compareTo(person2) > 0) {
//			System.out.println(person1.getName() + " is older than " + person2.getName());
//		} else if (person1.compareTo(person2) < 0) {
//			System.out.println(person1.getName() + " is younger than " + person2.getName());
//		} else {
//			System.out.println(person1.getName() + " and " + person2.getName() + " are of the same age.");
//		}
		List<Person> pList = Arrays.asList(person);
		Collections.sort(pList);
		System.out.println(pList.get(1));
	}
}
