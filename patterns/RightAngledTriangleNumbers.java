package patterns;

// Expected Output:
// 1
// 1 2
// 1 2 3  
// 1 2 3 4

public class RightAngledTriangleNumbers {
    public static void main(String[] args) {
        pattern();
    }

    private static void pattern() {
        System.out.println("\nRight Angled Triangle with Numbers is: ");
        for (int i = 0; i < 4; i++) {
            int counter = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}
