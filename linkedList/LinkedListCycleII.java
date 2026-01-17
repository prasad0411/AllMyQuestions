package linkedList;

import java.util.HashMap;

// DETECT IF A CYCLE EXISTS IN THE LL, IF YES, THEN FIND THE POSITION OF THAT NODE
// IF CYCLE DOES NOT EXIST, THEN RETURN -1

// Input: [1,2,0,4,2]
// 1

// Input: [2,3,4]
// -1

public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode headNode = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(0);
        ListNode fourthNode = new ListNode(-4);
        // ListNode fifthNode = new ListNode();

        headNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;

        System.out.print("Original LL is: ");

        ListNode tempNode = headNode;
        // while (tempNode != null) {
        // System.out.print(tempNode.val);
        // if (tempNode.next != null) {
        // System.out.print(" -> ");
        // }
        // tempNode = tempNode.next;
        // }

        System.out.print("\n\nDoes LL contain a cycle?");
        ListNode node = bruteForceApproach(headNode);
        if (node != null)
            System.out.println(node.val);
        else
            System.out.println("LL has no cycle.");
    }

    // APPROACH: Use a fast (moving 2x of slowP), and a slow pointer, if fastP ever
    // becomes equal to slowP, then a cycle exists

    // TC: O(n) - Traversing the LL once
    // SC: O(1) - No new data structure. Only creating 2 pointers.
    public static ListNode bruteForceApproach(ListNode headNode) {
        if (headNode == null) {
            return null;
        }
        int i = 0;

        HashMap<ListNode, Integer> mappedNodes = new HashMap<>();

        while (headNode != null) {

            if (mappedNodes.containsKey(headNode))
                return headNode;
            else
                mappedNodes.put(headNode, i++);

            headNode = headNode.next;
        }

        return null;
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
