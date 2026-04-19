package strings;

// RETURN WORDS OF THE STRING IN THE REVERSED ORDER

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "the sky";
        System.out.println("Original string is: " + s);
        System.out.println("Reversed words of the string is: " + bruteForce(s));
    }

    // APPROACH: First trim the input string, then traverse from right to left //
    // Maintain a counter to count the non empty characters
    // If it is blank character, then extract the string so far, by using the
    // counter varaible
    // Reduce lastPosition variable in each iteration
    // Append the first word of the original string separately since it wont be
    // added due to lack of ' ' before 1st string

    // TC: O(n) - Linear traversing across the entire string
    // SC: O(n). Creating a StringBuilder.
    public static String bruteForce(String s) {
        System.out.println("Brute Force Approach ->");

        s = s.trim();
        StringBuilder answer = new StringBuilder(s.length());
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
