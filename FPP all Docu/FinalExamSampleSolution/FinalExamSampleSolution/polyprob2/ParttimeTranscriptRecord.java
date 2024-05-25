package June2022.polyprob2;
import java.util.*;
public class ParttimeTranscriptRecord {
	private List<Double> grades = new ArrayList<>();
	public void insertGrade(double val) {
		grades.add(val);
	}
	
	public List<Double> getGrades() {
		return grades;
	}
}
