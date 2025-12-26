package strings;

// RETURN THE INTEGER EQUIVALENT OF THE STRING VALUE

public class StringToInteger_atoi {
    public static void main(String[] args) {
        String s = "   -042";
        System.out.println("Original string is: " + s);
        System.out.println("Integer form of the string is: " + optimalApproach(s));
    }

    // APPROACH: First trim the input string, then check if it is empty, if not,
    // check the character at 0th index for the sing, and then process individual
    // character and get its integer value, if it is a digit
    // In a while loop, append the character by mulitplying it by 10 and adding the
    // integer value of the character.

    // TC: O(n) - Linear traversing across the entire string
    // SC: O(1). Not creating any new data structure.
    public static int optimalApproach(String s) {
        System.out.println("Optimal Approach ->");

        // Edge case: String is null
        if (s == null) {
            throw new IllegalArgumentException("String is empty.");
        }

        // Edge case: String is empty
        if (s.length() == 0)
            return 0;

        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        int i = 0;
        int sign = 1;
        long answer = 0;

        // check for the sign of the number
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // Current character - '0' returns the current digit in int format
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            answer = answer * 10 + s.charAt(i) - '0';

            // overflow condition
            if (sign * answer > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            // overflow condition
            if (sign * answer < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign * answer);
    }
}
