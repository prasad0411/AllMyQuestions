package linkedList;

import java.util.HashMap;

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
        // fourthNode.next = fifthNode;

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
        ListNode node = bruteForceApproach(headNode);
        System.out.println(node.val);
    }

    static HashMap<ListNode, Integer> mappedNodes = new HashMap<>();

    public static ListNode bruteForceApproach(ListNode headNode) {
        if (headNode == null) {
            return null;
        }

        ListNode tempNode = headNode;
        int i = 0;

        while (tempNode != null) {
            mappedNodes.put(tempNode, i++);
            if (mappedNodes.containsKey(tempNode))
                return tempNode;

            tempNode = tempNode.next;
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
