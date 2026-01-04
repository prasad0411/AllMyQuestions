import java.util.Arrays;

// RETURN THE SUM OF ALL DIVISORS OF A NUMBER, WHERE NUMBER OF DIVISORS = 4. 
// IF THERE IS NO SUCH NUMBER HAVING 4 DIVISORS, RETURN 0

// Input: arr = [21, 4, 7]
// Output: 32 
// 21 has 4 divisors: 1, 3, 7, 21
// 4 has 3 divisors: 1, 2, 4
// 7 has 2 divisors: 1, 7

// Input: arr = [21,21]
// Output: 64

// Input: arr = [1,2,3,4,5]
// Output: 0

public class FourDivisors {
    public static void main(String[] args) {
        int[] numbers = { 21, 4, 7 };

        System.out.println("Original array is: " + Arrays.toString(numbers));
        System.out.println("The sum of the divisors is: " + sumFourDivisors(numbers));

    }

    public static int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int divisorsCount = 2;

            for (int j = 2; j <= nums[i] / 2; j++) {
                if (nums[i] % j == 0)
                    divisorsCount++;

                if (divisorsCount > 4)
                    break;
            }

            // 21, 4, 7

            if (divisorsCount == 4) {
                for (int j = 2; j <= nums[i] / 2; j++) {
                    if (nums[i] % j == 0)
                        totalSum += j;
                }

                int originalNumberSum = 1 + nums[i];
                totalSum += originalNumberSum;
            }
        }

        return totalSum;
    }
}
