package PATTERNS;

// Expected Output:
// * * *
// * *
// *

public class OppositeRightAngledTriangle {
    public static void main(String[] args) {
        pattern();
    }

    private static void pattern() {
        System.out.println("\nOpposite Right Angled Triangle is: ");
        for (int i = 3; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}