public class RotateImage {

    // WE HAVE AN N*N MATRIX, AND WE NEED TO ROTATE IT CLOCKWISE BY 90 DEGREES.

    // INPUT: [[1,2,3],[4,5,6],[7,8,9]]
    // OUTPUT: [[7,4,1],[8,5,2],[9,6,3]]

    // INPUT: [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
    // OUTPUT: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

    public static void main(String[] args) {
        int[][] originalMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int matrixSize = originalMatrix.length;

        System.out.println("Original 2D array is: ");
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println("");
        }

        optimalApproach(originalMatrix);

        System.out.println("\nRotated 2D array by 90 degrees is: ");
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Approach: We initially transpose the matrix so that we swap the columns with
    // rows. Use a temp variable to transpose all positions
    // We start j as i+1 so we can skip swapping diagonals and pairs which were
    // already swapped
    // Post transposing, we reverse each row to achieve the 90 degrees condition

    // TC: O(m *n)
    // Traverse all rows and columns, and use a temp variable to swap all positions
    // SC: O(1).
    // No new data structure
    private static void optimalApproach(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Matrix is null or has incorrect size.");
        }

        transpose(matrix);
        reverse(matrix);
    }

    private static void transpose(int[][] matrix) {
        int matrixSize = matrix.length;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = i + 1; j < matrixSize; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void reverse(int[][] matrix) {
        int matrixSize = matrix.length;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrixSize - 1 - j];
                matrix[i][matrixSize - 1 - j] = temp;
            }
        }
    }
}