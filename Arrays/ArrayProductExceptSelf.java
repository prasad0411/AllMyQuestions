package ARRAYS;
public class ArrayProductExceptSelf {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        product(arr);
    }

    // public static int product(int[] arr) {

    // int[] prod = new int[10];
    // int product = 1;
    // int i, j, k;
    // k = 0;
    // for (i = arr.length; i > 0; i--) {
    // product = product * arr[i];
    // }
    // for (i = 0; i < arr.length; i++) {
    // System.out.println(prod[i]);
    // }
    // return 0;
    // }

    static void product(int[] arr) {
        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            mult = mult * arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(mult / arr[i] + " ");
        }
    }
}
