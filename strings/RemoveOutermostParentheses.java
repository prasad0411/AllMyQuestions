package strings;

// FROM THE VALID PARANTHESES STRING, DECOMPOSE IT FIRST, AND THEN REMOVE THE OUTERMOST PARANTHESES
// RETURN THE RESULT OF THE ABOVE OPERATION

// Input: string: "()"
// Output: ""

// Input: string: "(()())(())"
// Output: "()()()"

// Input: string: "(()())(())(()(()))"
// Output: "()()()()(())"

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String originalString = "()";
        System.out.println("Original string is: " + originalString);
        System.out.println("String after removing the outer parantheses on the decomposed string is: "
                + removeOuterParentheses(originalString));
    }

    // APPROACH: Use a depth variable to check if we are at which level. If we are
    // at level 0, then we skip appending the parantheses to the answer string.
    // In depth is more than 0, we append it

    // TC: O(n). Traverse the entire string once
    // SC: O(1). Space for StringBuilder (worst case: n-2 characters).
    public static String removeOuterParentheses(String s) {

        // EDGE CASE: IF STRING IS NULL OR EMPTY
        if (s == null || s.length() == 0) {
            return "";
        }

        // StringBuilder because we will be appending new characters dynamically
        StringBuilder ansString = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) {
                    ansString.append(ch);
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    ansString.append(ch);
                }
            }
        }

        return ansString.toString();
    }
}
