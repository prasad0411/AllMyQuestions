// LC: 56. Merge Intervals.
// Problem: We have an array of intervals where interval[i] = [start, end]
// Return an array of the non overlapping intervals that covers all the sub intervals 
// Constraints: Each element in the array is positive
// Each subarray has atmost 2 elements
// If the start and end index match, then we can merge the subintervals

// Input: [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]

// Input: [[1,4],[4,5]]
// Output: [[1,5]]

// Pattern: Arrays: Intervals (sort then sweep)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    // Approach: Sort the array, so all the sub intervals are sorted by their start
    // indices. If end index >= start index, then merge the 2 sub intervals.
    // TC: O(N Log N) + O(N)
    // SC: O(n) Result list holding merged intervals
    public static int[][] optimalApproach(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> mergedIntervals = new ArrayList<>();
        for (int[] subinterval : intervals) {
            if (mergedIntervals.isEmpty() || subinterval[0] > mergedIntervals.get(mergedIntervals.size() - 1)[1]) {
                mergedIntervals.add(subinterval);
            } else {
                int[] last = mergedIntervals.get(mergedIntervals.size() - 1);
                last[1] = Math.max(subinterval[1], last[1]);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

    public static void main(String[] args) {
        int intervals[][] = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        System.out.println("Original array is: " + Arrays.deepToString(intervals));
        System.out.println(
                "Merged subintervals are: Optimal Approach: " + Arrays.deepToString(optimalApproach(intervals)));
    }
}
