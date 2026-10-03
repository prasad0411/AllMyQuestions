package strings;

// LC: 125. Valid Palindrome
// Problem: Return true if after converting all uppercase letters into lowercase, and after removing all alphanumeric characters, the string still reads the same forward and backward

// Constraints: Strings will only have ASCII characters.

// Input: "A man, a plan, a canal: Panama"
// Output: true

// Input: "race a car"
// Output: false

// Pattern: Strings: 2 pointers
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        // System.out.println("Brute Force => is string Palindrome? " + bruteForce(s));
        System.out.println("Optimal Approach => is string Palindrome? " + optimalApproach(s));
    }

    // Approach: Two pointers from both ends. Skip non-alphanumeric chars on either
    // side.
    // Compare the two (lowercased); if they differ, not a palindrome. Else move
    // both inward.
    // TC: O(n). One pass with two pointers.
    // SC: O(1). No new data structure.
    public static boolean optimalApproach(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char leftChar = s.charAt(i);
            char rightChar = s.charAt(j);
            if (!Character.isLetterOrDigit(leftChar))
                i++;
            else if (!Character.isLetterOrDigit(rightChar))
                j--;
            else if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    // Approach: Create a new string by accepting only digits and letter characters.
    // Compare it in the end using 2 pointers to check if it is a palindrome
    // TC: O(n). One pass over the original string + another pass to check for
    // palindrome
    // SC: O(n). Storing in a new string
    public static boolean bruteForce(String s1) {
        StringBuilder ansString = new StringBuilder();
        int i;
        for (i = 0; i < s1.length(); i++) {
            char currentCh = s1.charAt(i);
            if (Character.isLetterOrDigit(currentCh))
                ansString.append(Character.toLowerCase(currentCh));
        }

        i = 0;
        int j = ansString.length() - 1;
        while (i < j) {
            if (ansString.charAt(i++) != ansString.charAt(j--))
                return false;
        }

        return true;
    }
}
