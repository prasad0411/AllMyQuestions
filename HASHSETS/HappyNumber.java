package HASHSETS;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int inputNumber = 1;
        if (inputNumber < 1) {
            System.exit(1);
        }
        boolean ans = bruteForce(inputNumber);
        System.out.println(ans);
    }

    // TC: O(log^2 n). Outer loop traveses through each number
    // SC: O(log n). Due to HashSet
    public static boolean bruteForce(int inputNumber) {
        HashSet<Integer> usedNumbers = new HashSet<>();

        while (inputNumber != 1 && !usedNumbers.contains(inputNumber)) {
            usedNumbers.add(inputNumber);
            int sumOfSquares = 0;

            // INNER LOOP IS TO SEPARATE DIGITS AND DO SUM
            while (inputNumber != 0) {
                int lastDigit = inputNumber % 10;
                sumOfSquares += lastDigit * lastDigit;
                inputNumber = inputNumber / 10;
            }
            inputNumber = sumOfSquares;
        }
        return inputNumber == 1;

    }
}
