package misclenneous;

public class Palindrome {
    public static void main(String[] args) {
        int number = 122;
        if (number < 0)
            System.out.println("Number is not bruteForce");
        else if (number < 10)
            System.out.println("Number is bruteForce");
        else
            System.out.println(bruteForce(number));
    }

    private static boolean bruteForce(int number) {
        int originalNumber = number;
        int newNumber = 0;
        while (number != 0) {
            newNumber = (newNumber * 10) + number % 10;
            number = number / 10;
        }

        return originalNumber == newNumber;
    }
}
