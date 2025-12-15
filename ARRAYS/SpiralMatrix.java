import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// A M*N 2D MATRIX IS GIVEN. RETURN ALL THE ELEMENTS IN A SPIRAL ORDER

// Input: [[1,2,3],[4,5,6],[7,8,9]]  
// Output: [1,2,3,6,9,8,7,4,5]

// Input: [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println("Original Matrix is: " + Arrays.deepToString(matrix));
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(" ");
        }

        List<Integer> resultList = spiralOrder(matrix);
        System.out.println("\nSpiralled Matrix is: " + resultList);
    }

    // APPROACH: Use 4 boundary pointers (rowBegin, rowEnd, colBegin, colEnd)
    // to traverse the matrix layer by layer in spiral order, shrinking boundaries
    // after each direction.

    // TC: O(m * n).
    // Traversing the entire matrix through all the 4 pointers
    // SC: O(1) auxiliary space (output List not counted)
    public static List<Integer> spiralOrder(int[][] matrix) {
        System.out.println("Optimal Approach => ");

        // BASE CASE
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Invalid matrix size.");
        }

        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;

        List<Integer> resultList = new ArrayList<>();

        while (colBegin <= colEnd && rowBegin <= rowEnd) {
            // Traverse right in the top most row
            for (int i = colBegin; i <= colEnd; i++) {
                resultList.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            // Traverse downwards in the right most column
            for (int i = rowBegin; i <= rowEnd; i++) {
                resultList.add(matrix[i][colEnd]);
            }
            colEnd--;

            // Traverse leftwards in the bottom most row
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    resultList.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            // Traverse upwards in the left most column
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    resultList.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }

        return resultList;
    }
}