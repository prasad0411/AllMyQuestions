package STRINGS;

// FIND THE LONGEST COMMON PREFIX FROM GIVEN SET OF STRINGS IN AN ARRAY

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[] { "flower", "flow", "flight" };
        System.out.println("Original Array is: " + Arrays.toString(strs));
        System.out.println("Longest common prefix is: '" + longestCommonPrefix(strs) + "'");
    }

    // TC: O(M * N) Traverses through M strings of N lengths
    // SC: O(N) No new data structure to store the answer

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefixString = strs[0]; // consider this as the main comparison string

        for (int i = 1; i < strs.length; i++) { // traverse till all strings in array
            while (!strs[i].startsWith(prefixString)) { // check prefix string against all other strings as a prefix
                prefixString = prefixString.substring(0, prefixString.length() - 1); // Keep trimming the prefix until
                                                                                     // it's a valid prefix of the
                                                                                     // current string

                if (prefixString.isEmpty())
                    return "";
            }
        }
        return prefixString;
    }
}