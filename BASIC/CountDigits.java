package BASIC;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(0));
    }

    private static int countDigits(int num) {
        if (num == 000)
            return 1;

        int counter = 0;
        while (num != 0) {
            num = num / 10;
            counter++;
        }
        return counter;
    }
}
