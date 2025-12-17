package stacks;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String originalString = "()";
        System.out.println("Original string is: " + originalString);
        System.out.println("String after removing the outer parantheses on the decomposed string is: "
                + removeOuterParentheses(originalString));
    }

    public static String removeOuterParentheses(String s) {

        // EDGE CASE: IF STRING IS NULL OR EMPTY
        if (s == null || s.length() == 0) {
            return "";
        }

        StringBuilder ansString = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) {
                    ansString.append(ch);
                }
                depth++;
            }

            // String originalString = "(()())(())";
            // ans: ()
            // depth: 1
            else {
                depth--;
                if (depth > 0) {
                    ansString.append(ch);
                }
            }
        }

        return ansString.toString();
    }
}
