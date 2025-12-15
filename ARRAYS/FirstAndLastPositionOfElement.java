import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int originalArray[] = { 1 };
        int target = 1;
        System.out.println("Array is: " + Arrays.toString(originalArray));
        System.out.println("Index positions are:" + Arrays.toString(bruteForce(originalArray, target)));
    }

    public static int[] bruteForce(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("Array is null or has invalid size");
        }

        if (nums.length == 0) {
            return new int[] { -1, -1 };
        }

        int startindex = -1, lastIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (startindex == -1) { 
                    startindex = i;
                }
                lastIndex = i;
            }
        }

        if (startindex != -1) {
            return new int[] { startindex, lastIndex };
        }

        return new int[] { -1, -1 };
    }
}
