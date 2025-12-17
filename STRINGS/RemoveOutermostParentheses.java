package strings;

// FROM THE VALID PARANTHESES STRING, DECOMPOSE IT FIRST AND THEN REMOVE THE OUTERMOST PARANTHESES

// Input: string: "()"
// Output: 

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

    // APPROACH: Sort the elements, and return the answer element when
    // arr[i]!=arr[i+1]

    // TC: O(n log n). Sort the array and traverse through all elements
    // once
    // SC: O(1). No new data structure is created.
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
