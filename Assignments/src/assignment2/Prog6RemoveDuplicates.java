package assignment2;

public class Prog6RemoveDuplicates {
    public static void main(String[] args) {
        String[] arr = new String[]{"horse", "dog", "cat", "horse", "dog", "horse", "dog", "dog",
                "elephant", "elephant", "eagle", "eagle"};
        String[] ar = removedups(arr);
        for (String i : ar)
            System.out.println(i);
    }

    public static String[] removedups(String[] arr) {


        boolean isDuplicate;
        int index = 0;
        int uniquecount = 1;

        for (int i = 0; i < arr.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < uniquecount; j++) {
                if (arr[i].equals(arr[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[uniquecount++] = arr[i];
            }

        }

        String[] uniquearray = new String[uniquecount];
        System.arraycopy(arr, 0, uniquearray, 0, uniquecount);
        return uniquearray;


    }
}
