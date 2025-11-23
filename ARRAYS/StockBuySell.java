// AN UNSORTED ARRAY OF PRICES IS GIVEN
// FIND THE DAY TO BUY STOCKS AND A DAY IN THE FUTURE TO SELL IT, TO HAVE MAXIMUM PROFIT

// Input: [7,1,5,3,6,4]  
// Output: 5, Explaination: Buy on day 2, and sell on day 5, profit = 6-1

// Input:[7,6,4,3,1]
// Output: 0, Explaination: No transaction is good, profit = 0
import java.util.Arrays;

public class StockBuySell {

    public static void main(String[] args) {
        int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        System.out.println("Original array is: " + Arrays.toString(prices));
        // System.out.println("Maximum profit is: " + optimalApproach(prices));
        System.out.println("Maximum profit is: " + bruteForceApproach(prices));
    }

    // APPROACH: Use a single loop to traverse the array
    // Start i from from 0th index, declare buy price as Math.min value
    // Calculate min buying price and profit if we sell today
    // Also calculate max profit at each iteration

    // Time Complexity: O(n)
    // Traversing the whole array once, considering max profit at each iteration
    // Space Complexity: O(1)
    // No new data structure
    public static int optimalApproach(int[] prices) {
        // BASE CASE
        if (prices == null || prices.length == 0) {
            throw new IllegalArgumentException("Input array is null or has an invalid size.");
        }

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            buyPrice = Math.min(buyPrice, prices[i]);
            int todayProfit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, todayProfit);
        }

        return maxProfit;
    }

    // APPROACH: Use 2 separate loops
    // Start i from from 0th index for buying price, and start j from i+1 for
    // selling price.
    // At each iteration, check if today' SP - CP is max profit

    // Time Complexity: O(n * n)
    // Traversing the whole array twice, once for CP, then for SP
    // Space Complexity: O(1)
    // No new data structure
    public static int bruteForceApproach(int[] prices) {
        // BASE CASE
        if (prices == null || prices.length == 0) {
            throw new IllegalArgumentException("Input array is null or has an invalid size.");
        }

        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(prices[j] - prices[i], maxProfit);
            }
        }

        return maxProfit;
    }
}
