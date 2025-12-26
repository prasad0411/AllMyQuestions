package strings;

// RETURN WORDS OF THE STRING IN THE REVERSED ORDER

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "the sky";
        System.out.println("Original string is: " + s);
        System.out.println("Reversed words of the string is: " + reverseWords(s));
    }

    // APPROACH: First trim the input string, then traverse from the end of the
    // string.
    // Maintain a counter to count the non empty characters and process them each
    // time when hitting a blank space
    // After processing each character, reduce the lastPosition index
    // Append the first word of the original string separately since it wont be
    // added due to lack of ' ' before 1st string

    // TC: O(n) - Linear traversing across the entire string
    // SC: O(n). Creating a StringBuilder.
    public static String reverseWords(String s) {
        s = s.trim();

        StringBuilder answer = new StringBuilder();
        int counter = 0;
        int lastPosition = s.length() - 1;

        while (lastPosition >= 0) {
            char currentCharacter = s.charAt(lastPosition);

            if (currentCharacter == ' ') {
                if (counter != 0) {
                    answer.append(s, lastPosition + 1, lastPosition + counter + 1).append(' ');
                    counter = 0;
                }
            } else {
                counter++;
            }

            lastPosition--;
        }

        // Append the final word (the first word of the original string)
        if (counter != 0) {
            answer.append(s, 0, counter);
        }

        return answer.toString();
    }
}
