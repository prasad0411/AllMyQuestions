package linkedList;

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

        ListNode tempNode = new ListNode();
        tempNode = headNode;

        System.out.println("Original LL is: ");

        while (tempNode != null) {
            System.out.print(tempNode.val + " -> ");
            tempNode = tempNode.next;
        }

        ListNode reversedLLNode = new ListNode();
        System.out.println("\n\nReversed LL is: ");
        reversedLLNode = bruteForceApproach(headNode);

        while (reversedLLNode != null) {
            System.out.print(reversedLLNode.val + " -> ");
            reversedLLNode = reversedLLNode.next;
        }
    }

    // APPROACH: Traverse the original LL, preserve values of all nodes in an array.
    // Traverse this array from the last index and over write all the values of the
    // original LL.

    // TC: O(n) to calculate size of LL + O(n) to populate the array from LL + O(n)
    // to overwrite the LL
    // SC: O(n) Creating an array, to store the LL values of each node temporarily.
    public static ListNode bruteForceApproach(ListNode headNode) {
        System.out.println("Brute Force Approach => ");

        ListNode tempNode = new ListNode();
        tempNode = headNode;

        int sizeLL = 0;
        while (tempNode != null) {
            sizeLL++;
            tempNode = tempNode.next;
        }

        tempNode = headNode;

        int[] arrayOfLL = new int[sizeLL];
        for (int i = 0; i < sizeLL; i++) {
            arrayOfLL[i] = tempNode.val;
            tempNode = tempNode.next;
        }

        ListNode reverseLLPointer = new ListNode();
        reverseLLPointer = headNode;
        for (int i = sizeLL - 1; i >= 0; i--) {
            reverseLLPointer.val = arrayOfLL[i];
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
