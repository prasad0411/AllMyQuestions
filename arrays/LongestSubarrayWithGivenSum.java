public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] inputArr = new int[] { 2, 3, 5 };
        int sum = 5;
        bruteForceApproach(inputArr, sum);
    }

    private static void bruteForceApproach(int[] inputArr, int sum) {
        if (inputArr == null || inputArr.length < 1) {
            throw new IllegalArgumentException("Array is null or empty.");
        }

    }
}
