package strings;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String originalString = "babad";
        System.out.println("Original string is: " + originalString);
        System.out.println("Palindrome string is: " + longestPalindrome(originalString));
    }

    public static String longestPalindrome(String s) {
        System.out.println("Brute Force Approach => ");

        if (s == null || s.isEmpty())
            throw new IllegalArgumentException("String is empty.");

        StringBuilder palindromeString = new StringBuilder();
        String maxString = Character.toString(s.charAt(0));

        for (int i = 0; i < s.length();) {
            for (int j = i; j < s.length(); j++) {
                int leftPointer = i;
                int rightPointer = j;
                while (leftPointer < rightPointer) {
                    if (s.charAt(i) != s.charAt(j)) {
                        break;
                    } else {
                        palindromeString.append(s.charAt(i));
                        i++;
                        j--;
                    }
                }

                maxString = maxString.length() > palindromeString.length() ? maxString : palindromeString.toString();
            }
        }

        // babad
        return maxString;
    }
}
