import java.util.ArrayList;
import java.util.List;

// LC: 15. 3Sum.
// Problem: We have an array of size N. Return triplets whose sum equals to 0
// Constraints: i != j, i != k, and j != k
// & nums[i] + nums[j] + nums[k] == 0
// & solution set must not contain duplicate triplets

// Input: [-1,0,1,2,-1,-4] 
// Output: [[-1,-1,2],[-1,0,1]]

// Input: [0,0,0]
// Output: [[0,0,0]

// Pattern: Arrays: 2 pointers
public class ThreeSum {

    // Approach: Use 3 pointers starting at different indices and iterate over the
    // array to fulfill the constraints
    // TC: O(n*n*n)
    // SC: O(n) no new data structure
    public List<List<Integer>> bruteForce(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; j < nums.length - 2; j++) {
                    
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
