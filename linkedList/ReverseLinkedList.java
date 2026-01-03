package linkedList;

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

        ListNode tempNode = new ListNode();
        tempNode = headNode;

        System.out.println("Original LL is: ");

        while (tempNode != null) {
            System.out.print(tempNode.val + " -> ");
            tempNode = tempNode.next;
        }

        ListNode reversedLLNode = new ListNode();
        System.out.println("\nReversed LL is: ");
        reversedLLNode = reverseList(headNode);

        while (reversedLLNode != null) {
            System.out.print(reversedLLNode.val + " -> ");
            reversedLLNode = reversedLLNode.next;
        }

    }

    public static ListNode reverseList(ListNode headNode) {
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
