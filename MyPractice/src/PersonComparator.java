import java.util.Arrays;
import java.util.Comparator;

class PersonC {
	String name;
	int age;

	public PersonC(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}

// Comparator class for comparing Person objects based on age
class AgeComparator implements Comparator<PersonC> {
	@Override
	public int compare(PersonC p1, PersonC p2) {
		return Integer.compare(p1.age, p2.age);
	}
}

public class PersonComparator {
	public static void main(String[] args) {
		PersonC[] people = new PersonC[] { new PersonC("Alice", 25), new PersonC("Bob", 30),
				new PersonC("Charlie", 22) };

		// Sorting the array using a Comparator without lambda expression
		Arrays.sort(people, new AgeComparator());

		// Printing the sorted array
		for (PersonC person : people) {
			System.out.println(person);
		}
	}
}
