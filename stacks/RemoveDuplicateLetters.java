package stacks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// LC: 316. Remove Duplicate Letters

// Problem: Remove all the duplicate characters from a string.
// Ensure result is smallest in lexicographical order 

// Constraints: Every character is a lowercase Engish character.
// Atleast 1 character exists in the string.

// Input: "bcabc"
// Output: "abc"

// Input: "cbacdcbc"
// Output: "acdb"

// Pattern: Stacks
public class RemoveDuplicateLetters {
    // Approach: Count frequency of each char. Iterate the string, decrementing
    // count as you consume each char. Skip chars already in the result. Otherwise,
    // while the last kept char is greater than current and still appears later
    // (count > 0), pop it so a smaller char can come first. Then append current.
    // TC: O(N) Traversing the whole string
    // SC: O(N) Storing count of all characters in Map + Storing unique characters
    // in Set
    public static String bruteForce(String s) {

        Map<Character, Integer> freqCount = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqCount.put(ch, freqCount.getOrDefault(ch, 0) + 1);
        }

        Set<Character> resultSet = new HashSet<>();

        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray()) {
            freqCount.put(ch, freqCount.get(ch) - 1);

            if (resultSet.contains(ch))
                continue;

            while (!ans.isEmpty() &&
                    ans.charAt(ans.length() - 1) > ch &&
                    freqCount.get(ans.charAt(ans.length() - 1)) > 0) {
                char removed = ans.charAt(ans.length() - 1);
                ans.deleteCharAt(ans.length() - 1);
                resultSet.remove(removed);
            }

            resultSet.add(ch);
            ans.append(ch);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println("Original string is: " + s);
        System.out.println("Does the string have valid parantheses?: Brute Force: " + bruteForce(s));
    }
}
