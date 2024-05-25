
package assignment7;

public class MinSort {
    public String sort(String s) {
        if (s.length() <= 1) {
            return s; // Base case: empty string or single character, no need to sort
        } else {
            int minPos = findMinPos(s);
            char minChar = s.charAt(minPos);

            // Remove character minChar from the string and put it in string t
            String t = s.substring(0, minPos) + s.substring(minPos + 1);

            // Sort t recursively and place in storage to the right of the character minChar
            String sortedT = sort(t);

            // Return the stored string
            return minChar+ sortedT;
        }
    }

    private int findMinPos(String s) {
        char minChar = s.charAt(0);
        int minPos = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < minChar) {
                minChar = s.charAt(i);
                minPos = i;
            }
        }

        return minPos;
    }

       public static void main(String[] args) {
        MinSort ms = new MinSort();
        String result = ms.sort("zwxuabfkafutbbbb");
        System.out.println(result);
    }
}
