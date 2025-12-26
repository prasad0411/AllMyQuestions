package basic;

// RETURN THE SQUARE ROOT OF THE NUMBER. IF NOT A PERFECT SQUARE, RETURN THE FLOOR VALUE OF NUMBER

public class SquareRoot {
    public static void main(String[] args) {
        int n = 28;
        System.out.println("Original number is: " + n);
        System.out.println("Square root of " + n + " is: " + findsquareRoot(n) + " (floor)");
    }

    // APPROACH: Have a middle index, and check if mid* mid is > than original
    // number.
    // If yes, reduce high, else, increase low
    // while altering low, keep an answer variable (long) too to track the square of
    // the largest value <n (floor value)

    // TC: O(log n) - Search space becomes half during each iteration
    // SC: O(1). Not creating any new data structure.
    public static int findsquareRoot(int n) {
        System.out.println("Optimal Approach ->");

        if (n < 0)
            throw new IllegalArgumentException("Number is invalid");

        int low = 1;
        int high = n;
        long answer = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == n) {
                return mid;
            } else if (square > n) {
                high = mid - 1;
            } else {
                answer = mid;
                low = mid + 1;
            }
        }

        return (int) answer;
    }
}
