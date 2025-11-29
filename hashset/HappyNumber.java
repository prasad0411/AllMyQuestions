package hashset;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int inputNumber = 19;

        System.out.println("Original number is: " + inputNumber);
        if (bruteForce(inputNumber)) {
            System.out.println(inputNumber + " is a happy number.");
        }
    }

    // TC: O(log^2 n). Outer loop traveses through each number
    // SC: O(log n). Due to HashSet
    public static boolean bruteForce(int inputNumber) {
        System.out.println("Brute force approach: ");
        if (inputNumber <= 0) {
            throw new IllegalArgumentException("Invalid input number.");
        }

        if (inputNumber == 1)
            return true;

        int sum = 0;
        int lastNum = 0;
        Set<Integer> uniqueSums = new HashSet<>();

        // input: 19
        // lastNum: 9
        // sum: 0
        //
        while (inputNumber != 1 || !uniqueSums.contains(sum)) {
            lastNum = inputNumber % 10;
            sum += lastNum * lastNum;
            uniqueSums.add(sum);
            inputNumber /= 10;

            if (inputNumber / 10 == 0) {
                inputNumber = 0;
            }

            if (sum == 1)
                return true;
        }
        return false;

    }
}
