import java.util.ArrayList;
// LC: 15. 3Sum.
// Problem: We have an array of size N. Return triplets whose sum equals to 0
// Constraints: i != j, i != k, and j != k (indices)
// & nums[i] + nums[j] + nums[k] == 0
// & solution list must not contain duplicate triplets

// Input: [4, 3, 6, 2, 1, 1] 
// [1, 5]
// Output: [[-1,-1,2],[-1,0,1]]

// Input: [0,0,0]
// Output: [[0,0,0]

// Pattern: Arrays: 2 pointers
public class MissingAndRepeating {
    public static ArrayList<Integer> findTwoElement(int arr[]) {
        // repeat
        for (int i = 0; i < arr.length; i++) {
            // fix it
            if (arr[i] == 0) {

            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 3, 6, 2, 1, 1 };
    }
}
