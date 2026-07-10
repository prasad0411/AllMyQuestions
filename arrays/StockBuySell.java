
import java.util.Arrays;

// LC: 121. Best time to Buy and Sell stocks.
// Problem: We have an array, Price, P[i] is the price of the stock each day.
// Find a day in the future when we can make maximum profit by selling that stock, which was purchased on an earlier day
// Constraints: The stock cannot be purchased and sold at the same day. It cant be sold before it is purchased. Return 0 if there is no profit

// Input: [2,1,5,3,6,4]  
// Output: 5

// Input:[7,6,4,3,1]
// Output: 0

// Pattern: Arrays: Extrema Tracking 

public class StockBuySell {

    public static void main(String[] args) {
        int[] prices = new int[] { 2, 1, 5, 3, 6, 4 };
        System.out.println("Original array is: " + Arrays.toString(prices));
        // System.out.println("Maximum profit is: " + optimalApproach(prices));
        System.out.println("Brute Force Approach: Maximum profit is: " + bruteForceApproach(prices));
    }

    // Approach: While iterating over the array, maintain the cheapest value and the
    // global profit. And profit is today' price - cheapest
    // Core Takeaway: Track best candidates as you iterate, don't search separately
    // TC: O(n)
    // SC: O(1)
    @SuppressWarnings("unused")
    private static int optimalApproach(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;

        int maxProfit = 0;
        int cheapestValue = prices[0];

        for (int currentPrice : prices) {
            cheapestValue = Math.min(cheapestValue, currentPrice);
            maxProfit = Math.max(maxProfit, currentPrice - cheapestValue);
        }

        return maxProfit;
    }

    // Approach: Iterate over the array using 2 loops from the end. Maintain a
    // max profit that compares against each profit in each iteration.
    // TC: O(n * n)
    // SC: O(1)
    private static int bruteForceApproach(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;

        for (int i = prices.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                currentProfit = prices[i] - prices[j];
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }
}
