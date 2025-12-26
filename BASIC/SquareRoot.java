package basic;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 28;
        System.out.println("Original number is: " + n);
        System.out.println("Square root of " + n + " is: " + findsquareRoot(n));
    }

    public static int findsquareRoot(int n) {
        int low = 1;
        int high = n;
        long answer = 0;
        // 1 2 3 4 5 6 7 8
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sqaure = mid + mid;
            if (sqaure == n) {
                return (int) mid;
            } else if (sqaure > n) {
                high = mid - 1;
            } else {
                answer = mid;
                low = mid + 1;
            }
        }

        return (int) answer;
    }
}
