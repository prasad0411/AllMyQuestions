package misclenneous;

import java.util.Scanner;

public class FibonnaciSeries {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the count for the fibonnaci series: ");
        int lastTerm = sc.nextInt();
        int first_Term = 0;
        int second_Term = 1;
        System.out.print("Sequence is: " + first_Term + " " + second_Term);
        int sum = 0;

        for (int i = 2; i < lastTerm; i++) {
            sum = first_Term + second_Term;
            System.out.print(" " + sum);
            first_Term = second_Term;
            second_Term = sum;
        }
        sc.close();
    }
}
