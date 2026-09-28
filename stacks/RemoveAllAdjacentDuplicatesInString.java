package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

// LC: 1047. Remove All Adjacent Duplicates In String

// Problem: We have a string that contains lowercase english characters.
// Remove all adjacent and duplicate letters from the string.
// Return the final string till we can no longer remove duplicates.

// Constraints: Every character is a lowercase Engish character.
// Atleast 1 character exists in the string.

// Input: "abbaca"
// Output: "ca"

// Input: "azxxzy"
// Output: "ay"

// Pattern: Stacks
public class RemoveAllAdjacentDuplicatesInString {
    // Approach: While pushing characters into Stack, check if current character
    // matches with the topmost elemnt of the Stack. If yes, pop it, so both
    // characters are removed.
    // TC: O(N) Traversing the whole string
    // SC: O(N) Storing all characters in Stack
    public static String removeDuplicates(String s) {
        if (s == null || s.length() == 0)
            throw new IllegalArgumentException("String is null or empty.");

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {

        }
        Deque<Character> stack = new ArrayDeque<>();

        return stack.toString();
    }

    public static void main(String[] args) {
        String s = "azxxzy";
        System.out.println("Original string is: " + s);
        System.out.println("String after removing all adjacent duplicates: Optimal approach: " + removeDuplicates(s));
    }
}
