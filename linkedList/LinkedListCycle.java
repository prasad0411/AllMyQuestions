package linkedList;

import java.util.HashSet;

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

        System.out.print("Original LL is: ");

        ListNode tempNode = headNode;
        while (tempNode != null) {
            System.out.print(tempNode.val);
            if (tempNode.next != null) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }

        System.out.print("\n\nDoes LL contain a cycle?");
        // System.out.println(optimalApproach(headNode));
        System.out.println(bruteForceApproach(headNode));
    }

    public static boolean optimalApproach(ListNode headNode) {
        System.out.print("\nOptimal Approach => : ");

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

    public static boolean bruteForceApproach(ListNode headNode) {
        System.out.print("\nOptimal Approach => : ");

        if (headNode == null) {
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
