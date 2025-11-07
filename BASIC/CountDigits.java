package BASIC;

// Count digits in a given number.

public class CountDigits {
    public static void main(String[] args) {
        try {
            System.out.println(countDigits(-1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // TC: O(log n). Traverse through all the digits of the number, and in each
    // iteration, we divive by 10
    // SC: O(1). No new data structure is used.

    private static int countDigits(int num) {
        // BASE CASE: NUMBER IS NEGATIVE, NUMBER IS DIGIT 0
        if (num < 0)
            throw new IllegalArgumentException("Invalid number");

        if (num == 0)
            return 1;

        int counter = 0;
        while (num != 0) {
            num /= 10;
            counter++;
        }
        return counter;
    }
}