package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

// LC: 20. Valid Parentheses

// Problem: We have a string that contains '(', ')', '{', '}', '[', ']' characters.
// Return if input string is valid or not.

// Constraints: Every character is one of the brackets.
// There is atleast 1 character in the string.

// Input: "([)]"
// Output: false

// Input: "([])"
// Output: true

// Input: "()[]{}"
// Output: true  

// Pattern: Stacks
public class ValidParentheses {
    // Approach: Push opening brackets into Stack. For closing brackets, ensure
    // Stack is not empty. If not, current bracket must match with the topmost
    // bracket and pop it, else return false. In the end, return if Stack is empty
    // or no
    // TC: O(N) Traversing the whole string
    // SC: O(N) Storing all characters into Stack
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            char currentCh = s.charAt(i);
            if (currentCh == '(' || currentCh == '{' || currentCh == '[')
                stack.push(currentCh);
            else if (!stack.isEmpty()) {
                char topmostChar = stack.peek();
                if ((currentCh == ')' && topmostChar == '(')
                        || (currentCh == '}' && topmostChar == '{')
                        || (currentCh == ']' && topmostChar == '['))
                    stack.pop();
            } else
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(){";
        System.out.println("Original string is: " + s);
        System.out.println("Does the string have valid parantheses?: Optimal approach: " + isValid(s));
    }
}
