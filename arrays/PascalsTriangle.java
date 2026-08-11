import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 6;
        System.out.println("Pascal' triangle is: " + generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currentRow.add(1);
                } else {
                    List<Integer> previousRow = triangle.get(i - 1);
                    currentRow.add(previousRow.get(j) + previousRow.get(j - 1));
                }
            }

            triangle.add(currentRow);
        }

        return triangle;
    }

}

// 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1