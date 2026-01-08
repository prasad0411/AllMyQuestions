package linkedList;

public class LinkedListCycleII {
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

    private static char[] bruteForceApproach(ListNode headNode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bruteForceApproach'");
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
