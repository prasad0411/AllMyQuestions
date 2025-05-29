package PATTERNS;

// Expected Output:
// * * *
// * * *
// * * * 
// * * * 

public class Rectangle {
    public static void main(String[] args) {
        rectanglePattern();
    }

    private static void rectanglePattern() {
        System.out.println("\nRectangle pattern is: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
