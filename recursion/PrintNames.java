package recursion;
// PRINT NAME X TIMES

// Input: 5
// Ouput: Prasad Prasad Prasad Prasad Prasad

// Input: string: 0
// Output: ""

public class PrintNames {
    public static String name = "Prasad";

    public static void main(String[] args) {
        names(4);
        System.out.println();
    }

    public static void names(int count) {

        if (count > 0) {
            System.out.print(name + " ");
            names(count - 1);
        }

    }
}
