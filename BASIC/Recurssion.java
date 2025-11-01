package BASIC;

public class Recurssion {
    public static void main(String[] args) {
        recurssion(5, 0);
    }

    private static int recurssion(int num) {
        if (num < 1) {
            return 0;
        }

        return num + recurssion(num - 1);
    }
}
