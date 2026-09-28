package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

// Stack DS: It is a LIFO DS
// It is a vertical DS
// We can only access its topmost element at any given time
// We insert elements into the Stack by using push()
// We remove elements from the Stack by using pop()
// We can check the topmost element by using peek()
// We can check if Stack is empty by isEmpty()

public class StacksPractice {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Is Stack empty? " + stack.isEmpty());
        System.out.println("Stack' size: " + stack.size());
        System.out.println("Topmost element in the Stack is: " + stack.peek());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Current Stack values: " + stack);
    }
}
