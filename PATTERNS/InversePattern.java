package PATTERNS;

// Expected Output:
//     *
//   * * *  
// * * * * * 

public class InversePattern {
    public static void main(String[] args) {
        pattern();
    }

    private static void pattern() {
        System.out.println("\nInversePattern: ");
        for (int i = 0; i < 4; i++) {
            int counter = 1;
            for (int j = i; j < 4; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}
