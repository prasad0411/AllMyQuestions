package misclenneous;
public class ArmstrongNumber {
    public static void main(String[] args) {

        int originalNumber = 0;
        int number = originalNumber;
        int remainder = 0;
        int sum = 0;

        while (number != 0) {
            remainder = number % 10;
            number = number / 10;
            sum += remainder * remainder * remainder;
        }
        if (sum == originalNumber)
            System.out.println("Armstrong number");
        else
            System.err.println("Not an armstrong number");
    }
}
