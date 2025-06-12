package ARRAYS;

public class MaximumDiffernceBetweenAdjacentElements {
    public static void main(String[] args) {
        int nums[] = new int[] { -5, -10, -5 };
        System.out.println(maxAdjacentDistance(nums));
    }

    public static int maxAdjacentDistance(int[] nums) {
        int max = Math.abs(nums[0] - nums[nums.length - 1]);

        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, Math.abs(nums[i] - nums[i + 1]));
        }
        return max;
    }
}
