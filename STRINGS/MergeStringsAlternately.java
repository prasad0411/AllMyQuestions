package STRINGS;

// Given two strings word1 and word2, merge them by alternating characters from each string.

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"

// Input: word1 = "hello", word2 = "123"
// Output: "h1e2l3lo"

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "prasad";
        String word2 = "123";

        System.out.println("Word 1: " + word1 + "\nWord 2: " + word2 + "\n");
        if (word1.isEmpty() && word2.isEmpty()) {
            System.out.println("Invalid string sizes");
            return;
        }
        if (word1.isEmpty() && word2.length() >= 1) {
            System.out.println("String 1 is empty, so displaying only String 2: " + word2);
            return;
        }
        if (word1.length() >= 1 && word2.isEmpty()) {
            System.out.println("String 2 is empty, so displaying only String 1: " + word1);
            return;
        }
        System.out.println("Merged strings: " + optimalApproach(word1, word2));
    }

    // Time Complexity: O(m+n). lengths of word 1(m) and word 2(n)
    // We are traversing through all elements from both the strings
    // Space Complexity: O(m+n). lengths of word 1(m) and word 2(n)
    // Create a new char array to store all the elements from both the strings

    public static String optimalApproach(String word1, String word2) {
        char resultcharArray[] = new char[word1.length() + word2.length()];
        int newIndex = 0, i = 0;
        for (; i < word1.length() && i < word2.length(); i++) {
            resultcharArray[newIndex++] = word1.charAt(i);
            resultcharArray[newIndex++] = word2.charAt(i);
        }

        while (i < word1.length())
            resultcharArray[newIndex++] = word1.charAt(i++);
        while (i < word2.length())
            resultcharArray[newIndex++] = word2.charAt(i++);

        return new String(resultcharArray);
    }
}
