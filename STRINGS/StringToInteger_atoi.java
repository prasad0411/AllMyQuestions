package strings;

public class StringToInteger_atoi {
    public static void main(String[] args) {
        String s = "20000000000000000000";
        System.out.println("Original string is: " + s);
        System.out.println("Integer form of the string is: " + myAtoi(s));
    }

    public static int myAtoi(String s) {
        int finalValue = 0;
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        int traversal = 0;

        char[] originalChractacters = s.toCharArray();
        StringBuilder finalString = new StringBuilder();
        boolean isPositive = true;

        if (originalChractacters[0] == '-') {
            isPositive = false;
            traversal = 1;
        } else if (originalChractacters[0] == '+') {
            traversal = 1;
        }

        for (int i = traversal; i < s.length(); i++) {
            if (!Character.isDigit(originalChractacters[i])) {
                break;
            }
            finalString.append(originalChractacters[i]);
        }

        if (finalString.isEmpty())
            return 0;

        long temp = Long.parseLong(finalString.toString());

        if (!isPositive)
            temp *= -1;

        if (temp > Integer.MAX_VALUE) {
            finalValue = Integer.MAX_VALUE;
        } else if (temp < Integer.MIN_VALUE) {
            finalValue = Integer.MIN_VALUE;
        } else {
            finalValue = (int) temp;
        }

        return finalValue;
    }
}
