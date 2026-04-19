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
        System.out.println("The sum of the divisors is: " + bruteForceApproach(numbers));
        System.out.println("The sum of the divisors is: " + optimalApproach(numbers));

    }

    // APPROACH: Traverse every element once, and in nested loop, check for its
    // divisors [ only up to sqrt(n) ]
    // If j divides the number, the paired divisor is n/j.
    // Add both divisors to currentSum (avoid double-counting if j*j == n).
    // If divisors count exceeds 4, break early.
    // After the loop, if exactly 4 divisors, add currentSum to totalSum.

    // TC: O(n * square root (k)). Traversing every element * finding each element'
    // divisors
    // SC: O(1). No new data structure is created.

    public static int optimalApproach(int[] nums) {
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int divisorsCount = 0;
            int currentSum = 0;

            for (int j = 1; j * j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    divisorsCount++;
                    currentSum += j;

                    int divisor2 = nums[i] / j;
                    if (divisor2 != j) {
                        divisorsCount++;
                        currentSum += divisor2;
                    }
                }

                if (divisorsCount > 4)
                    break;
            }

            if (divisorsCount == 4)
                totalSum += currentSum;
        }

        return totalSum;
    }

    // APPROACH: Traverse every element once, and then check for its divisors
    // If divisors count is more than 4, exit the loop, if its exactly 4, again
    // calculate its divisors and add their sums

    // TC: O(n * k). Traversing every element * finding each element' divisors
    // SC: O(1). No new data structure is created.

    private static int bruteForceApproach(int[] numbers) {
        int totalSum = 0;

        for (int n : numbers) {
            int divisorsCount = 0;
            int currentSum = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    divisorsCount++;
                    currentSum += i;
                }

                if (divisorsCount > 4) {
                    break; // stop early if too many divisors
                }
            }

            currentSum += n;
            divisorsCount++; // include the number itself

            if (divisorsCount == 4) {
                totalSum += currentSum;
            }
        }

        return totalSum;
    }
}
