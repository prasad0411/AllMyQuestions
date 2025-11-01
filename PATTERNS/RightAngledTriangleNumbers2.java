package PATTERNS;

// Expected Output:
// 1
// 2 2
// 3 3 3 
// 4 4 4 4 

public class RightAngledTriangleNumbers2 {
    public static void main(String[] args) {
        pattern();
    }

    private static void pattern() {
        int counter = 1;
        System.out.println("\nRight Angled Triangle with Numbers 2 is: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter + " ");
            }
            System.out.println();
            counter++;
        }
    }
}