
import java.util.HashSet;
import java.util.Set;

// LC: 73. Set Matrix Zeroes
// Prolbem: A 2D array (m * n) is given, which contains elements 1 and 0.
// If an element is 0, set its entire row and column to 0

// Input: [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

// Input: [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

// Pattern: 2D Matrix: 

public class SetMatrixZero {
    public static void main(String[] args) {
        int originalArr[][] = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

        System.out.println("Original matrix is ");
        for (int i = 0; i < originalArr.length; i++) {
            for (int j = 0; j < originalArr[0].length; j++) {
                System.out.print(originalArr[i][j] + " ");
            }
            System.out.println("");
        }

        bruteForce(originalArr);
        System.out.println("\nModified matrix is: Brute Force Approach: ");
        for (int i = 0; i < originalArr.length; i++) {
            for (int j = 0; j < originalArr[0].length; j++) {
                System.out.print(originalArr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Approach: Traverse the original array and store row and column indices which
    // contain 0 in a Set. Modify the original array based on these Set
    // values.
    // TC: O(m * n). Traversing the M*N array
    // SC: O(m + n). Storing zero elements in a Set
    public static int[][] optimalApproach(int[][] matrix) {
        return new int[][];
    }

    // Approach: Traverse the original array and store row and column indices which
    // contain 0 in a Set. Modify the original array based on these Set
    // values.
    // TC: O(m * n). Traversing the M*N array
    // SC: O(m + n). Storing zero elements in a Set
    public static int[][] bruteForce(int[][] matrix) {
        Set<Integer> setRowZero = new HashSet<>();
        Set<Integer> setColumnZero = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    setRowZero.add(i);
                    setColumnZero.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (setRowZero.contains(i) || setColumnZero.contains(j))
                    matrix[i][j] = 0;
            }
        }

        return matrix;
    }
}