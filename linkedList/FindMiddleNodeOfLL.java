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

        ListNode midnNode2 = optimalApproach(head);
        System.out.println("Middle Node element of the LL is: " + midnNode2.val);
    }

    // APPROACH: Use 2 pointers, slowP and fastP and ensure fastP is not null and
    // its next node is not null too.
    // If true, increment slowP and fastP by 1 and 2 respectively.

    // TC: O(n/2) = O(n). Traverse the LL via fastP, which moves at 2x speed
    // SC: O(1) Not creating any new data structure.

    public static ListNode optimalApproach(ListNode head) {
        System.out.println("Optimal Approach => ");

        if (head == null) {
            System.out.println("LL is empty, cannot find the middle element");
            return head;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }

    // APPROACH: Calculate the size of the LL, and do (size/2) to get the middle
    // node. traverse till that node, and return that node

    // TC: O(n). A loop to traverse till the end of LL to get its size, and then
    // another loop to reach the middle node
    // SC: O(1) Not creating any new data structure.

    public static ListNode bruteForce(ListNode head) {
        System.out.println("Brute Force Approach => ");

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
