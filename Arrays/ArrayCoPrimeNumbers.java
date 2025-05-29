package ARRAYS;

public class ArrayCoPrimeNumbers {
    public static void main(String[] args) {

        int arr[] = new int[] { 10, 12, 14 };
        int size = arr.length;
        int ans = coPrime(arr, size);
        System.out.println(ans);
    }

    static int coPrime(int arr[], int size) {
        if (size > 0) {
            int count;
            // FINDING FACTORS OF A NUMBER
            for (int i = 0; i < size; i++) {
                count = 0;
                for (int j = 1; j <= arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        count++;
                    }
                }
                System.out.println("\nFactors of " + arr[i] + " are " + count);
            }
        } else
            return -1;
        return -1;
    }
}
