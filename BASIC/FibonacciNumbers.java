package basic;

public class FibonacciNumbers {

    public static void main(String[] args) {
        int fibNumber = 4;
        System.out.println("Original number is: " + fibNumber);
        System.out.println("Fibonnaci Series sequence is:" + fib(fibNumber));
    }

    public static int fib(int fibNumber) {
        if (fibNumber < 0)
            throw new IllegalArgumentException("Invalid input number.");

        else if (fibNumber == 0)
            return 0;

        else if (fibNumber == 1)
            return 1;

        else {
            int i = 0;
            int j = 1;
            int sum = i + j;

            while (fibNumber > 2) {
                // 3
                // 2 +1
            }
        }
        return sum;
    }

}
