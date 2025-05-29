package PATTERNS;

// Expected Output:
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3 
// 1 2 
// 1

public class OppositeRightAngledTriangleWithNumbers {
    public static void main(String[] args) {
        pattern();
    }

    private static void pattern() {
        System.out.println("\nOpposite Right Angled Triangle with Numbers is: ");
        for (int i = 1; i <= 5; i++) {
            int counter = 1;
            for (int j = i; j <= 5; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}
