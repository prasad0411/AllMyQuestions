
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// A 2D ARRAY IS GIVEN, WHICH CONTAINS NON ZERO AND ZERO ELEMENTS
// WE NEED TO MODIFY IT IN PLACE SUCH THAT IF AN ELEMENT IS 0, WE NEED TO SET ITS ENTIRE ROW AND COLUMN AS 0  

// Input: [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

// Input: [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] matrix = new int[][] { { 1, 1, 1 }, { 2, 0, 2 }, { 3, 3, 3 } };
        System.out.println("Original 2D array is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        // System.out.println("Modified 2D array is: " +
        // Arrays.deepToString(bruteForce(matrix)));

        matrix = bruteForce(matrix);
        System.out.println("Modified 2D array is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Approach: In a HashSet, store all the row and column indices where 0 element
    // is present
    // Use the 2 Sets to traverse through original array'row and col, while we
    // traverse from the Set'row and col

    // TC: O(m *n)
    // Traverse all rows and columns initially to store indices of 0 element
    // Based on these Sets, traverse all the necessary rows and columns again
    // SC: O(m)+ O(n).
    // Add m+ n elements into the Set from original array

    public static int[][] bruteForce(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Matrix is null or has incorrect size.");
        }

        Set<Integer> rowIndices = new HashSet<>();
        Set<Integer> colIndices = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowIndices.add(i);
                    colIndices.add(j);
                }
            }
        }

        for (int row : rowIndices) {
            Arrays.fill(matrix[row], 0);
        }

        for (int col : colIndices) {
            for (int[] matrix1 : matrix) {
                matrix1[col] = 0;
            }
        }

        return matrix;
    }
}