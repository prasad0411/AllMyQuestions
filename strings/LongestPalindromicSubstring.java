package strings;

// A STRING IS GIVEN. RETURN THE LONGEST PALINDROMIC SUBSTRING. IF THERE ARE MANY SUBSTRINGS, RETURN ANY

// Input: babad
// Output: bab
// Output: aba

// Input: cbbd
// Output: bb

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String originalString = "cbbd";
        System.out.println("Original string is: " + originalString);
        System.out.println("Longest Palindrome SubString is: " + longestPalindrome(originalString));
    }

    // APPROACH: Use 2 loops to traverse the entire string. And use 2 pointers to
    // traverse the string from left and right side.
    // If current substring is palindrome, then compare it against the longest
    // palindromic substring achieved so far and return that

    // TC: O(n * n * n). Two loops O(n * n) * isPalindrome check O(n)
    // SC: O(1) auxiliary space (output string created is not counted)

    public static String longestPalindrome(String s) {
        System.out.println("Brute Force Approach => ");

        if (s == null || s.isEmpty())
            return "";

        String maxString = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int leftPointer = i;
                int rightPointer = j;

                if (isPalindrome(leftPointer, rightPointer, s)) {
                    String currentSubstring = s.substring(i, j + 1);
                    maxString = maxString.length() > currentSubstring.length() ? maxString : currentSubstring;
                }
            }
        }

        return maxString;
    }

    // Checks if current string is palindrome or no
    public static boolean isPalindrome(int leftPointer, int rightPointer, String s) {
        while (leftPointer < rightPointer) {
            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return false;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }

        return true;
    }
}
