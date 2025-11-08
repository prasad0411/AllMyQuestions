package patterns;

// Expected Output:
// *
// * *
// * * * 
// * * * * 

public class RightAngledTriangle {
    public static void main(String[] args) {
        pattern();
    }

    private static void pattern() {
        System.out.println("\nRight Angled pattern is: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
