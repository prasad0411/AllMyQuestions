package ARRAYS;

// MOVE ALL ZEROES TO THE END, AND DO IT IN PLACE

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int numbers[] = new int[] { 0, 0, 1, 2, 0 };
        optimalApproach(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }

    // TC: O(N): TRAVERSES THE ARRAY ONCE TO MOVE NON-ZERO ELEMENTS AND APPEND
    // ZEROES
    // SC: O(1): MODIFIES THE ARRAY IN PLACE WITHOUT EXTRA SPACE

    public static void optimalApproach(int[] numbers) {
        int j = 0; // index for non-zero elements

        // First pass: move non-zero elements to the front
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[j++] = numbers[i];
            }
        }

        // Second pass: fill remaining with zeros
        while (j < numbers.length) {
            numbers[j++] = 0;
        }
    }
}