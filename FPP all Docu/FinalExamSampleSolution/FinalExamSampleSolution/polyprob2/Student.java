package June2022.polyprob2;

abstract public class Student {
	private String name;
	public Student(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	abstract public double computeGpa();
}
