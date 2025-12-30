package linkedList;

import java.util.Arrays;

// FIND THE MIDDLE NODE OF A LL

// Input: [1,2,3,4,5]
// Output: [3,4,5]

// Input: [[1,2,3,4]
// Output: [3,4]

public class FindMiddleNodeOfLL {

    static ListNode head = new ListNode(1);

    public static void main(String[] args) {
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode fourthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(5);
        ListNode sixthNode = new ListNode(6);

        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;

        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;
        int i = 0;
        int[] originalArray = new int[size];
        while (temp != null) {
            originalArray[i] = temp.val;
            temp = temp.next;
            i++;
        }

        System.out.println("Original LL, converted to array is: " + Arrays.toString(originalArray));
        ListNode midnNode = bruteForce(head);
        System.out.println("Middle Node element of the LL is: " + midnNode.val);
    }

    // APPROACH: Calculate the size of the LL, and do (size/2) to get the middle
    // node. traverse till that node, and return that node

    // TC: O(n). Traverse the LL, and then then traverse till the middle node
    // SC: O(1)

    public static ListNode bruteForce(ListNode head) {
        if (head == null) {
            System.out.println("LL is empty, cannot find the middle element");
            return head;
        }

        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int middleNode = size / 2;

        temp = head;
        int counter = 0;
        while (counter < middleNode) {
            temp = temp.next;
            counter++;
        }

        return temp;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
