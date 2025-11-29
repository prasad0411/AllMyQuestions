package searching;

import java.util.Arrays;

public class LowerBound {
    public static void main(String[] args) {
        int[] originalArr = new int[] { 3, 5, 8, 15, 19 };
        int targetElement = 9;
        System.out.println("Original array is: " + Arrays.toString(originalArr));
        System.out.println("lowest index/ bound that is >= element " + targetElement + " is: "
                + findLowerBound(originalArr, targetElement));
    }

    private static int findLowerBound(int[] originalArr, int targetElement) {
        int leftP = 0;
        int rightP = originalArr.length - 1;
        int ansIndex = originalArr.length;
        while (leftP <= rightP) {
            // 3,5,8,15,19
            // 9
            int middleElement = leftP + ((rightP - leftP) / 2);
            if (originalArr[middleElement] >= targetElement) {
                // 8, 9
                // 0, 1: 3,5
                ansIndex = middleElement;
                rightP = middleElement - 1;
            } else if (originalArr[middleElement] < targetElement) {
                leftP = middleElement + 1;
                // 3, 4: 15, 18
                // 15
            }
        }

        return ansIndex;
    }
}