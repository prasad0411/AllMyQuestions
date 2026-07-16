public class RotateImage {

    // LC: 48. Rotate Image.
    // Problem: We have an N*N matrix, and we need to rotate it clockwise by 90
    // degrees.

    // Input: [[1,2,3],[4,5,6],[7,8,9]]
    // Output: [[7,4,1],[8,5,2],[9,6,3]]

    // Input: [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
    // Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

    public static void main(String[] args) {
        int[][] originalMatrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int matrixSize = originalMatrix.length;

        System.out.println("Original 2D array is: ");
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println("");
        }

        bruteForce(originalMatrix);

        System.out.println("\nRotated 2D array by 90 degrees is: ");
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Approach: Create a new matrix, and for every row i in the original, place the
    // elemnent in column (size - i - 1) of rotated matrix;
    // TC: O(N * N)
    // SC: O(N * N)
    private static int[][] bruteForce(int[][] matrix) {
        int size = matrix.length;
        int rotatedMatrix[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            int rotatedCol = size - 1 - i;
            int rotatedRow = 0;

            for (int j = 0; j < size; j++) {
                rotatedMatrix[rotatedRow][rotatedCol] = matrix[i][j];
                rotatedRow++;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rotatedMatrix[i][j];
            }
        }

        return rotatedMatrix;
    }
}