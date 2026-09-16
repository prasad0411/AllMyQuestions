import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// LC: 15. 3Sum.
// Problem: We have an array of size N. Return triplets whose sum equals to 0
// Constraints: i != j, i != k, and j != k (indices)
// & nums[i] + nums[j] + nums[k] == 0
// & solution list must not contain duplicate triplets

// Input: [-1,0,1,2,-1,-4] 
// -1, -1, 0, 1, 2, 4
// Output: [[-1,-1,2],[-1,0,1]]

// Input: [0,0,0]
// Output: [[0,0,0]

// Pattern: Arrays: 2 pointers
public class ThreeSum {
    // Approach: Sort the array, so we can quickly flush out duplicates. Lock 1 of
    // the triplets. Use 2 pointers approach on the rest of the array. Keep moving
    // ahead if you see the same digits.
    // TC: O(N*N)
    // SC: O(1) Not creating any new data structure
    public static List<List<Integer>> optimalApproach(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                }
            }
        }
        return new ArrayList<>(triplets);
    }

    // Approach: Lock one number of the triplet. Then, iterate over the array to
    // find the 2nd and 3rd number of the triplet using 2Sum.
    // TC: O(N^2)
    // SC: O(M + N) M = unique triplets stored in the Set
    // N = All elements being stored in Set at each iteration
    public static List<List<Integer>> betterThanBruteForce(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int thirdElement = -(nums[i] + nums[j]);

                if (seen.contains(thirdElement)) {
                    List<Integer> currentTriplet = new ArrayList<>();
                    currentTriplet.add(nums[i]);
                    currentTriplet.add(nums[j]);
                    currentTriplet.add(thirdElement);
                    Collections.sort(currentTriplet);
                    triplets.add(currentTriplet);
                }

                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(triplets);
    }

    // Approach: Use 3 loops to cover every possible triplet. Add that triplet to a
    // List. Sort that List and add it to a Set, so repeat triplets arent saved.
    // TC: O(N^3)
    // SC: O(M) M = unique triplets stored in the Set
    public static List<List<Integer>> bruteForce(int[] nums) {
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> currentTriplet = new ArrayList<>();

                        currentTriplet.add(nums[i]);
                        currentTriplet.add(nums[j]);
                        currentTriplet.add(nums[k]);

                        Collections.sort(currentTriplet);
                        uniqueTriplets.add(currentTriplet);
                    }
                }
            }
        }
        return new ArrayList<>(uniqueTriplets);
    }

    public static void main(String[] args) {
        int originalArr[] = new int[] { -1, 0, 1, 2, -1, -4 };
        System.out.println("Original array is: " + Arrays.toString(originalArr));
        System.out.println("3Sum triplets are: Brute Force: " + bruteForce(originalArr));
        System.out.println("3Sum triplets are: Better Than Brute Force: " + betterThanBruteForce(originalArr));
        System.out.println("3Sum triplets are: Optimal Approach: " + optimalApproach(originalArr));
    }
}
