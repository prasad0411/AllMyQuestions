package linkedList;

import java.util.ArrayList;

// FIND IF THE GIVEN LL IS PALINDROME OR NO

// Input: 1 -> 2 -> 2-> 1
// Output: true

// Input: 2 -> 3
// Output: false

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode headNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(2);
        ListNode fourthNode = new ListNode(1);

        headNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        System.out.println("Original LL is: ");

        ListNode tempNode = headNode;
        while (tempNode != null) {
            System.out.print(tempNode.val);
            if (tempNode.next != null) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println(" -> null");

        System.out.print("\nIs LL a palindrome? " + bruteForce(headNode) + "\n");
    }

    // APPROACH: Create an arrayList to store all the values of the LL, and then
    // compare the elements of the list, using 2 pointers

    // TC: O(n) + O(n/2) = O(n). Traverse the LL once and then traverse half the
    // list
    // SC: O(n) Creating an arrayList.

    public static boolean bruteForce(ListNode headNode) {
        ListNode lastNode = headNode;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (lastNode != null) {
            arrayList.add(lastNode.val);
            lastNode = lastNode.next;
        }

        int size = arrayList.size();

        for (int i = 0; i < size / 2; i++) {
            if (!arrayList.get(i).equals(arrayList.get(size - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
