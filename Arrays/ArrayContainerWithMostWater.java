package ARRAYS;

// TIME COMPLEXITY: O(n)
// SPACE COMPLEXITY: O(1)

// WORKS FOR SOME TEST CASES

public class ArrayContainerWithMostWater {
    private static int capacity(int[] arr) {

        int maxArea = 0;
        int leftP = arr[0];
        int rightP = arr.length - 1;

        if (arr.length == 0) {
            return maxArea;
        }

        while (leftP < rightP) {
            maxArea = Math.max(maxArea, (Math.min(arr[leftP], arr[rightP])) * rightP - leftP);

            if (arr[leftP] < arr[rightP]) {
                leftP++;
            } else {
                rightP--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {

        int arr[] = new int[] { 0 };
        System.out.println(capacity(arr));
        // System.out.println("Max capacity is: " + capacity(arr));
    }
}
