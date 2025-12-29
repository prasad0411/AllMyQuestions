package linkedList;

public class DeleteNodeInLL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static ListNode head;

    public static void main(String[] args) {
        ListNode firstNode = new ListNode(5);
        ListNode secondNode = new ListNode(10);
        ListNode thirdNode = new ListNode(30);
        head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        System.out.print("Original LL is: ");
        printLL();
        System.out.println("Deleting node: " + secondNode.val);
        deleteNode(secondNode);
        printLL();
    }

    public static void deleteNode(ListNode node) {
        // 1 2 3 4 5
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void printLL() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
