package strings;

// REVERSE A STRING

public class ReverseString {
    public static void main(String[] args) {
        String string = "Let's take LeetCode contest";
        System.out.println("Original string is => " + string);
        System.out.println("Reversed string is => " + reverseString(string));
    }

    // TC: O(n). Single traversal through the string and string construction
    // SC: O(n). Extra space for the char array and the final string
    public static String reverseString(String string) {
        char charArray[] = new char[string.length()];
        int j = string.length() - 1;
        for (int i = 0; i < string.length(); i++) {
            charArray[j] = string.charAt(i);
            j--;
        }
        return new String(charArray);
    }
}
