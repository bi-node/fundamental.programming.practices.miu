package assignment11.prog2;

import java.util.HashMap;
import java.util.List;

public class Schur {
    public static boolean checkForSum(List<Integer> list, Integer z) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer x : list) {
            // Check if there is an element y in the list such that x + y = z
            Integer y = z - x;
            if (map.containsKey(y)) {
                return true; // Found two elements whose sum is z
            }
            // Otherwise, add the current element to the map
            map.put(x, 1);
        }

        // No two elements whose sum is z found
        return false;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Integer z = 9;
        boolean result = checkForSum(list, z);
        System.out.println("Are there two elements in the list whose sum is " + z + "? " + result);
    }
}