package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

// LC: 155. Min Stack
// Problem: Design a stack that supports push, pop, top, and retrieving the min element in O(1) time.

// Constraints: pop, top and getMin operations will always be called on non-empty stacks.

// push(-2), push(0), push(-3), getMin() → -3, pop(), top() → 0, getMin() → -2

// Pattern: Stacks
public class MinStack {

    // Approach: While pushing characters into Stack, check if current character
    // matches with the topmost elemnt of the Stack. If yes, pop it, so both
    // characters are removed, else push into Stack
    // TC: O(N) Traversing the whole string
    // SC: O(N) Storing all characters in Stack and StringBuilder for reversal
    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> minstack = new ArrayDeque<>();

    public MinStack() {
    }

    public void push(int value) {
        stack.push(value);
        if (minstack.isEmpty() || value <= minstack.peek())
            minstack.push(value);
    }

    public void pop() {
        int removed = stack.pop();
        if (removed == minstack.peek())
            minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
