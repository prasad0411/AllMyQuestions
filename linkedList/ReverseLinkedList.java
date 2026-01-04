package linkedList;

import java.util.ArrayList;

// REVERSE A LL

// Input: [1,2,3,4,5]
// Output: [5,4,3,2,1]

// Input: [2,3,4]
// Output: [4,3,2]

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode headNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode fourthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(5);

        headNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;

        ListNode tempNode = headNode;

        System.out.println("Original LL is: ");

        while (tempNode != null) {
            System.out.print(tempNode.val);
            if (tempNode.next != null) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }

        // ListNode reversedLLBrute = bruteForceApproach(headNode);
        ListNode reversedLLOptimal = optimalApproach(headNode);

        System.out.println("Reversed LL is: ");

        while (reversedLLOptimal != null) {
            System.out.print(reversedLLOptimal.val);
            if (reversedLLOptimal.next != null) {
                System.out.print(" -> ");
            }
            reversedLLOptimal = reversedLLOptimal.next;
        }
        System.out.println("");
    }

    // APPROACH: Reverse the pointers in-place using three pointers (prev, current,
    // next)

    // TC: O(n) - single pass through the list
    // SC: O(1) - only using 3 pointer variables (no extra data structures)

    public static ListNode optimalApproach(ListNode headNode) {
        System.out.println("\n\nOptimal Approach => ");

        ListNode currentNode = headNode;
        ListNode prevNode = null;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        return prevNode;
    }

    // APPROACH: Traverse the original LL, preserve values of all nodes in an
    // ArrayList.
    // Traverse this ArrayList from the last index and over write all the values of
    // the original LL.

    // TC: O(n) to populate the arrayList from LL + O(n) to overwrite the LL
    // Overall: 2 * O(n) = O(n), ignorning the constant

    // SC: O(n) Creating an array, to store the LL values of each node temporarily.

    public static ListNode bruteForceApproach(ListNode headNode) {
        System.out.println("\n\nBrute Force Approach => ");

        ListNode tempNode = headNode;

        ArrayList<Integer> arrList = new ArrayList<>();
        while (tempNode != null) {
            arrList.add(tempNode.val);
            tempNode = tempNode.next;
        }

        ListNode reverseLLPointer = headNode;

        for (int i = arrList.size() - 1; i >= 0; i--) {
            reverseLLPointer.val = arrList.get(i);
            reverseLLPointer = reverseLLPointer.next;
        }

        return headNode;
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
