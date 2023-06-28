public class Array2sum {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 33, 4 };
        int target = 6;
        twoSum(arr, target);
    }

    // Method to find two numbers in the array that add up to the target
    static int[] twoSum(int arr[], int target) {
        // Check if the array is empty
        if (arr.length < 0) {
            return null;
        }

        int i, j;
        j = 0;
        // Iterate over each element in the array
        for (i = 0; i < arr.length; i++) {
            // Check the sum of the current element with all subsequent elements
            for (j = i + 1; j < arr.length; j++) {
                // If the sum of two elements is equal to the target and the elements are not the same,
                // return the indices of the two elements as an array
                if (arr[i] + arr[j] == target && i != j) {
                    return new int[] { i, j };
                }
            }
        }
        // If no such pair is found, return null
        return null;
    }
}
