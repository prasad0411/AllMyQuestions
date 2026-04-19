// LC: 485. Max Consecutive Ones
// GIVEN A BINARY ARRAY, RETURN THE MAXIMUM NUMBER OF CONSECUTIVE 1'S PRESENT IN IT

// Constaints: 
// The array only consists of only 0s and 1s.
// We need to return an int number from the main function

// 1. Understand and restate the problem
// 2. Clarify edge cases (null, empty, all 0s, all 1s, single element)
// 3. Mention constraints
// 4. Explain Brute Force (briefly, even if you won't code it)
// 5. Explain Optimal Approach (intuition first, before coding)
// 6. Implement with running commentary
// 7. Conclude with TC, SC, and trade-offs

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int originalArray[] = new int[] { 1, 0, 1, 1, 0, 1 };
        System.out.print("Original array is: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nMaximum number of consecutive 1's are: " + findMaxConsecutiveOnes(originalArray));
    }

    // APPROACH: Use a loop to traverse the whole array in 1 pass.
    // At each step, check if current number is 1 or 0.
    // If it is 1, then increment counter. In this block, update the global counter
    // as well
    // If it is 0, then reset the local counter.
    // TC: O(n). Traversing the whole array just once.
    // SC: O(1). No new data structure is created.
    static int findMaxConsecutiveOnes(int[] originalArray) {
        int maxCounter, currentCounter;
        maxCounter = currentCounter = 0;

        if (originalArray == null || originalArray.length == 0) {
            return maxCounter;
        }

        for (int num : originalArray) {
            if (num == 1) {
                currentCounter += 1;
                maxCounter = Math.max(maxCounter, currentCounter);
            } else {
                currentCounter = 0;
            }
        }

        return maxCounter;
    }
}
