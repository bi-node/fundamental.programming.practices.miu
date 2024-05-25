package day1;

import java.util.HashMap;
import java.util.Map;

public class FindingFrequencies {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 3, 4, 5, 3, 4, 4, 2 };
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		// Counting the frequency of each element in the array
		for (int num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		// Printing the frequencies
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
		}
	}

}
