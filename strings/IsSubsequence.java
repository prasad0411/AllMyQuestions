package strings;

// LC: 392. Is Subsequence
// Problem: Given two strings s and t, return true if s is a subsequence of t.
// A subsequence keeps the same relative order but need not be contiguous.

// Constraints: s and t consist of lowercase English letters. Either may be empty.
// An empty s is always a subsequence.

// Input: s = "abc", t = "ahbgdc"
// Output: true

// Input: s = "axc", t = "ahbgdc"
// Output: false

// Pattern: Strings: Two Pointers
public class IsSubsequence {

    // Approach: Two pointers, one per string. Always advance t's pointer; advance
    // s's pointer only on a match. s is a subsequence if its pointer reaches the end.
    // TC: O(n). One pass over t
    // SC: O(1). No new data structure used
    public static boolean isSubsequence(String s, String t) {
        int i, j;
        i = j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println("S1: " + s);
        System.out.println("S2: " + t);
        System.out.println("Is subsequence? " + isSubsequence(s, t));
    }
}