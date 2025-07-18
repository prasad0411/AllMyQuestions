package STRINGS;

// CHECK IF ORIGINAL STRING BECOMES GOAL STRING WHEN WE ROTATE 1 CHAR IN EACH SHIFT

public class RotateStrings {
    public static void main(String[] args) {
        RotateStrings object = new RotateStrings();
        String s = "abc";
        String goal = "abc";
        System.out.println(object.bruteForce(s, goal));
    }

    // TC: O(n * n). Outer loop runs till original string' length.
    // Traverse inner loop for rotating a character each time.
    // SC: O(n). For char array and newly created rotated string.

    public boolean bruteForce(String s, String goal) {
        // edge case: original and goal lengths differ
        if (s.length() != goal.length()) {
            return false;
        }

        char charArray[] = s.toCharArray();

        // rotate in place, check for goal after each rotation
        for (int i = 0; i < s.length(); i++) {
            char tempChar = charArray[0];

            // shift characters left by one place
            for (int j = 0; j < s.length() - 1; j++) {
                charArray[j] = charArray[j + 1];
            }
            charArray[s.length() - 1] = tempChar;

            if (new String(charArray).equals(goal))
                return true;
        }
        return false;
    }
}