package linkedList;

import java.util.HashSet;

// DETECT IF A LOOP EXISTS IN THE LL

// Input: [1,2,0,4,2]
// true

// Input: [2,3,4]
// false

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode headNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(0);
        ListNode fourthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(2);

        headNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = secondNode;

        System.out.print("Original LL is: ");

        ListNode tempNode = headNode;

        // Not printing the loop since it is a cycle
        // while (tempNode != null) {
        // System.out.print(tempNode.val);
        // if (tempNode.next != null) {
        // System.out.print(" -> ");
        // }
        // tempNode = tempNode.next;
        // }

        System.out.print("\n\nDoes LL contain a cycle?");
        // System.out.println(optimalApproach(headNode));
        System.out.println(bruteForceApproach(headNode));
    }

    // APPROACH: Use a fast (moving 2x of slowP), and a slow pointer, if fastP ever
    // becomes equal to slowP, then a cycle exists

    // TC: O(n) - Traversing the LL once
    // SC: O(1) - No new data structure. Only creating 2 pointers.

    public static boolean optimalApproach(ListNode headNode) {
        System.out.print("\nOptimal Approach => : ");

        // Edge case: if there is just 1 node
        if (headNode == null || headNode.next == null) {
            return false;
        }

        ListNode slowP = headNode;
        ListNode fastP = headNode;

        while (fastP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;

            if (slowP == fastP) {
                return true;
            }
        }

        return false;
    }

    // APPROACH: Traverse the LL, and use a HashSet which stores the node' address,
    // and while iterating in the LL, if we come to the same address, then it is a
    // cycle

    // TC: O(n) - Traversing the LL once
    // SC: O(n) - Inserting every node' address in the HashSet

    public static boolean bruteForceApproach(ListNode headNode) {
        System.out.print("\nBrute Force Approach => : ");

        // Edge case: if there is just 1 node
        if (headNode == null || headNode.next == null) {
            return false;
        }

        HashSet<ListNode> visitedNodes = new HashSet<>();

        while (headNode != null) {
            if (visitedNodes.contains(headNode))
                return true;

            visitedNodes.add(headNode);
            headNode = headNode.next;
        }

        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
