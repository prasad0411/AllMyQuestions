
// INCOMPLETE CODE

public class ArrayRepeatAndMissingNumber {

    public static void repeatAndMissing(int arr[]) {
        int flag1, temp, flag2;
        flag1 = temp = flag2 = 0;

        // DUPLICATE NUMBERS IN AN ARRAY
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp = arr[i];
                    flag1 = 1;
                    break;
                }
            }
        }

        if (flag1 == 1) {
            System.out.println(temp);
            System.out.println("array element repeated");
        } else
            System.out.println("array element not repeated");

        // MISSING NUMBERS IN AN ARRAY
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] != 1) {
                    temp = arr[i];
                    flag2 = 1;
                    break;
                }
            }
        }
        if (flag2 == 1) {
            System.out.println("no element missing");
        } else
            System.out.println("element is missing" + temp++);

    }

    public static void main(String[] args) {
        // ArrayRepeatAndMissingNumber obj = new ArrayRepeatAndMissingNumber();
        int arr[] = new int[] { 1, 2, 5 };
        repeatAndMissing(arr);

    }
}
// i loop for each element
// j loop to compare i with all other elements