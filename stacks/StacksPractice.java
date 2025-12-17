package stacks;

import java.util.Stack;

public class StacksPractice {
    public static void main(String[] args) {
        Stack<Integer> stackDs = new Stack<>();
        System.out.println("Stack size is: " + stackDs.size());
        stackDs.push(10);
        System.out.println("Peeking top most element: " + stackDs.peek());
        stackDs.push(70);
        stackDs.push(00);
        stackDs.pop();
        System.out.println("Peeking top most element: " + stackDs.peek());
        stackDs.push(70);
        stackDs.pop();
        System.out.println("Peeking top most element: " + stackDs.peek());
    }
}
