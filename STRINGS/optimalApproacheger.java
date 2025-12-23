package strings;

import java.util.HashMap;
import java.util.Map;

// RETURN THE INTEGER EQUIVALENT OF ROMAN VALUES

public class optimalApproacheger {
    public static void main(String[] args) {
        String s = "IX";
        System.out.println("Original Roman string is: " + s);
        System.out.println("Equivalent Integer value of the Roman value is: " + optimalApproach(s));
    }

    // APPROACH: Maintain a map that 

    // TC: O(n) - Linear traversing across the entire string
    // SC: O(1). No new data structure.
    public static int optimalApproach(String s) {
        System.out.println("Optimal Approach ->");

        Map<Character, Integer> hashMap = new HashMap<>();

        char[] romanValues = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] intValues = { 1, 5, 10, 50, 100, 500, 1000 };
        for (int i = 0; i < 7; i++) {
            hashMap.put(romanValues[i], intValues[i]);
        }

        int ansValue = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int currentValue = hashMap.get(s.charAt(i));
            int nextValue = hashMap.get(s.charAt(i + 1));

            if (currentValue >= nextValue)
                ansValue += currentValue;
            else
                ansValue -= currentValue;
        }

        return ansValue + hashMap.get(s.charAt(s.length() - 1));
    }
}
