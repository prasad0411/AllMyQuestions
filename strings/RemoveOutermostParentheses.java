package strings;
// LC: 1021. Remove Outermost Parentheses

import java.util.Stack;

// Problem: We have a valid string of parantheses. Remove the outermost parantheses of every primitive decomposition and return the remaining string.

// Constraints: It will only have '(' or ')'
// It can be empty

// Input: (()())(())
// Output: ()()()

// Input: ()()
// Output: 

// Pattern: 
public class RemoveOutermostParentheses {
    // Approach: Use a Stack to track the opening and closing parantheses. For '(',
    // if Stack is not empty, then add it to answer, then always push it.
    // For ')', pop first and if Stack is not empty, add it to answer. If it is
    // empty, then do not add to Stack.
    // TC: O(n) Traverse the whole string
    // SC: O(1) No new DS created
    public static String optimalApproach(String s) {
        Stack<Character> validP = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if (currentCharacter == '(') {
                if (!validP.isEmpty())
                    ans.append(currentCharacter);
                validP.push(currentCharacter);
            } else {
                validP.pop();
                if (validP.size() != 0) {
                    ans.append(')');
                }
            }
        }
        return ans.toString();
    }

    // Approach: Use a Stack to track the opening and closing parantheses. For '(',
    // if Stack is not empty, then add it to answer, then always push it.
    // For ')', pop first and if Stack is not empty, add it to answer. If it is
    // empty, then do not add to Stack.
    // TC: O(n) Traverse the whole string and populate the Stack
    // SC: O(n) Storing all parantheses
    public static String bruteForce(String s) {
        Stack<Character> validP = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if (currentCharacter == '(') {
                if (!validP.isEmpty())
                    ans.append(currentCharacter);
                validP.push(currentCharacter);
            } else {
                validP.pop();
                if (validP.size() != 0) {
                    ans.append(')');
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "(()((()))())";
        System.out.println("Original string: " + s);
        System.out.println("String after removing the outer parantheses: Brute Force: " + bruteForce(s));
    }
}
