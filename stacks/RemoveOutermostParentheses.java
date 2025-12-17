package stacks;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println("Original string is: " + s);
        System.out.println("String after removing the outer parantheses is: " + removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {

        // EDGE CASE: IF STRING IS NULL OR EMPTY
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("String is null or has an invalid size.");
        }

        char[] characters = new char[s.length()];
        int counter = 0;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                counter++;
            else if (counter != 0)
                characters[index++] = s.charAt(i);
            else
                counter--;
        }
        return "";
    }
}
