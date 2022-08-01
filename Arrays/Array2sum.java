
public class Array2sum {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 33, 4 };
        int target = 6;
        twoSum(arr, target);
    }

    static int[] twoSum(int arr[], int target) {

        if (arr.length < 0) {
            return null;
        }
        int i, j;
        j = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target && i != j) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}
