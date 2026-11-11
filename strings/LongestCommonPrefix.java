package strings;

// LC: 14. Longest Common Prefix 
// Problem: Return the longest common prefix string from an array of strings

// Constraints: Strings in the array will be empty or have English lowercase letters.
// There will be atleast 1 string in the array

// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Input: strs = ["dog","racecar","car"]
// Output: ""

// Pattern: Strings: 
public class LongestCommonPrefix {
    // Approach:
    // TC: O(n).
    // SC: O(1).
    public static String optimalApproach(String[] strs) {

        return null;
    }

    // Approach: Use the string at 0th index for comparison for remaining strings in
    // array
    // TC: O(n). Traversing the whole string
    // SC: O(1). No new data structure is created.
    public static String bruteForce(String[] strs) {
        int arrLen = strs.length;
        if (arrLen == 1)
            return strs[0];

        String baseStr = strs[0];
        StringBuilder ansStr = new StringBuilder();
        for (int i = 1; i < arrLen; i++) {
            if (baseStr.isEmpty() || strs[i].isEmpty())
                return "";

            for (int j = 0; j < baseStr.length(); j++) {
                char currentCh = baseStr.charAt(j);
                if (currentCh == strs[i].charAt(j))
                    ansStr.append(currentCh);
            }
        }
        return ansStr.toString();
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flower", "flower", "flower" };
        System.out.println("Brute Force => Longest Common Prefix is: " + bruteForce(strs));
        // System.out.println("Optimal Approach => is string Palindrome? " +
        // optimalApproach(strs));
    }
}
