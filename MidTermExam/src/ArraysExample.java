import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Declaration and initialization
        int[] numbers = {5, 2, 8, 1, 3};

        // Displaying the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Searching for an element in the sorted array
        int key = 3;
        int index = Arrays.binarySearch(numbers, key);

        if (index >= 0) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }

        // Filling the array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Array filled with 7: " + Arrays.toString(filledArray));

        // Comparing arrays for equality
        int[] anotherArray = {5, 2, 8, 1, 3};
        boolean areEqual = Arrays.equals(numbers, anotherArray);

        if (areEqual) {
            System.out.println("The two arrays are equal");
        } else {
            System.out.println("The two arrays are not equal");
        }
    }
}
