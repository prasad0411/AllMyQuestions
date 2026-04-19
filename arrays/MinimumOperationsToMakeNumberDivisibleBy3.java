import java.util.Arrays;

public class MinimumOperationsToMakeNumberDivisibleBy3 {
    public static void main(String[] args) {
        int[] numsArray = new int[] { 3, 6, 9 };
        System.out.println("Original array is: " + Arrays.toString(numsArray));
        System.out.println("Minimum operations required are: " + minimumOperations(numsArray));
    }

    public static int minimumOperations(int[] numsArray) {
        int count = 0;
        for (int num : numsArray) {
            count += num % 3 == 0 ? 0 : 1;
        }
        return count;
    }
}