package ARRAYS;
class ArrayNextPermutation {

    public void nextPermutation(int[] arr) {

        System.out.println(("before finding permutation: "));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println("After permutation is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3 };

        ArrayNextPermutation obj = new ArrayNextPermutation();
        obj.nextPermutation(arr);
    }
}
