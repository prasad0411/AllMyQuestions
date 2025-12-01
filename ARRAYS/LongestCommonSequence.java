
import java.util.Arrays;

public class LongestCommonSequence {
    public static void main(String[] args) {
        int[] originalArr = new int[] { -3, -2, -1, 0, 1, 100, 200 };
        System.out.println(longestConsecutive(originalArr));
    }

    private static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxCount, count;
        maxCount = count = 1;
        // 5 10 15
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == nums[i - 1])
                continue;
            else if (nums[i] - nums[i - 1] == 1)
                count++;
            else
                count = 1;
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}