import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2 DIMENSIONAL ARRAY
        int arr[][] = new int[2][3];
        arr[0][0] = 001;
        arr[0][1] = 002;
        arr[0][2] = 003;
        arr[1][0] = 101;
        arr[1][1] = 102;
        arr[1][2] = 103;
        System.out.println("\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("array[" + i + "]" + "[" + j + "] =" + arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        sc.close();

    }
}
