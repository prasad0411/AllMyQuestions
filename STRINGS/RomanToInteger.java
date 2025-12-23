package strings;

import java.util.HashMap;
import java.util.Map;

// RETURN THE INTEGER EQUIVALENT OF ROMAN VALUES

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "XXVI";
        System.out.println("Original Roman string is: " + s);
        System.out.println("Equivalent Integer value of the Roman value is: " + optimalApproach(s));
        // System.out.println("Equivalent Integer value of the Roman value is: " +
        // bruteForceApproach(s));
    }

    // APPROACH: Maintain a switch case for mapping roman characters to their
    // integer values
    // If currentValue of the character is >= than the next character' value, then
    // add it to the result, else subtract from the result
    // Return the result + the value of character at last index in the string

    // TC: O(n) - Linear traversing across the entire string
    // SC: O(1). Not creating any new data structure.
    public static int optimalApproach(String s) {
        System.out.println("Optimal Approach ->");

        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("String is null or empty");
        }

        int ansValue = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int currentValue = valueOfCharacter(s.charAt(i));
            int nextValue = valueOfCharacter(s.charAt(i + 1));

            if (currentValue >= nextValue)
                ansValue += currentValue;
            else
                ansValue -= currentValue;
        }

        return ansValue + valueOfCharacter(s.charAt(s.length() - 1));
    }

    public static int valueOfCharacter(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral: " + ch);
        }
    }

    // APPROACH: Maintain a map that stores the Roman character and their
    // corresponding integer values.
    // If currentValue of the character is >= than the next character' value, then
    // add it to the result, else subtract from the result
    // Return the result + the value of character at last index in the string

    // TC: O(n) - Linear traversing across the entire string
    // SC: O(n). Creating a Map to map the Roman characters to integers.
    public static int bruteForceApproach(String s) {
        System.out.println("Brute Force Approach ->");

        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("String is null or empty");
        }
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
