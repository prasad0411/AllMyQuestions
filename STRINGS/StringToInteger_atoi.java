package strings;

// RETURN THE INTEGER EQUIVALENT OF THE STRING VALUE
public class StringToInteger_atoi {
    public static void main(String[] args) {
        String s = "   -042";
        System.out.println("Original string is: " + s);
        System.out.println("Integer form of the string is: " + myAtoi(s));
    }

    public static int myAtoi(String s) {
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        int i = 0;
        int sign = 1;
        long finalValue = 0;

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            finalValue = finalValue * 10 + s.charAt(i) - '0';

            if (sign * finalValue > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (sign * finalValue < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign * finalValue);
    }
}
