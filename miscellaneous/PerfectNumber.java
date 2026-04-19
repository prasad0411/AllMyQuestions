package misclenneous;
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(mainFunction(2));
    }

    public static boolean mainFunction(int originalNum) {
        if (originalNum < 1) {
            System.out.println("Invalid number. Exiting program...");
            System.exit(1);
        }
        int sum = 1;
        for (int i = 2; i <= originalNum / 2; i++) {
            if (originalNum % i == 0)
                sum += i;
        }
        return originalNum == sum;
    }
}
