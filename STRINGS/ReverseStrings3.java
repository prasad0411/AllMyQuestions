package strings;

// A STRING WITH MULTIPLE WORDS IS GIVEN  
// NEED TO REVERSE EACH WORD WHILE MAINTAINING WORD ORDER  

// Input: "Let's take LeetCode contest"  
// Output: "s'teL ekat edoCteeL tsetnoc"  

// Input: "Hello World"  
// Output: "olleH dlroW"  

public class ReverseStrings3 {
    public static String inputString = "";

    public static void main(String[] args) {
        inputString = "Let's take LeetCode contest";
        System.out.println("Original inputString is => " + inputString);
        System.out.println("Reversed inputString is => " + breakString(inputString));
    }

    // Time Complexity: O(n)
    // Single traversal of the input string.
    // Space Complexity: O(n)
    // Extra space for storing words and the final result.

    public static String breakString(String inputString) {
        String words[] = inputString.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(reverseString(word)).append(" ");
        }
        return sb.toString().trim();
    }

    private static String reverseString(String word) {
        char reversedCharArray[] = new char[word.length()];
        int j = word.length() - 1;
        for (int i = 0; i < word.length(); i++) {
            reversedCharArray[i] = word.charAt(j);
            j--;
        }
        return new String(reversedCharArray);
    }
}
