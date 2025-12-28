package linkedList;

public class LinkedListBasics {

    // Creating a node class which will be a node. it stores data and a pointer to
    // the next node
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // this is a global pointer
    static Node head;

    public static void printLinkedList() {
        System.out.print("\nPrinting Linked List: ");
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // We have some nodes, but we need to insert at the beginning of the LL, so we
    // directly touch the head node
    public static void addNodeAtStart(int n) {
        System.out.println("\nAdding a node " + n + " at the start of the LL: ");
        Node newNode = new Node(n);
        newNode.next = head;
        head = newNode;
    }

    public static void addNodeAtEnd(int n) {
        System.out.println("\nAdding a node " + n + " at the end of the LL: ");

        Node newNode = new Node(n);

        // Since there may be 0 nodes in the LL, we check only using head, no need of
        // temp, as we are not traversing
        if (head == null) {
            System.out.println("\nLL is empty. So adding the node at the first position.");
            head = newNode;
            return;
        } else {
            // Since LL is not empty, we need to traverse and put the node at the end of LL
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return;
        }
    }

    // Since we have to delete a node from the start of the LL, we can directly move
    // the head pointer by +1
    public static void deleteNodeFromStart() {
        System.out.println("\nDeleting a node from the start of LL:");

        if (head == null) {
            System.out.println("\nLL is empty. Cannot delete the first node.");
            return;
        }

        head = head.next;
    }

    public static void deleteNodeFromEnd() {
        System.out.println("\nDeleting a node from the end of LL:");

        // Check if head is null,
        if (head == null) {
            System.out.println("\nLL is empty. Cannot delete the last node.");
            return;
        } else if (head.next == null) {
            head = null;
            printLinkedList();
            return;
        } else {
            // Since LL is not empty, we need to traverse till the end of LL, and delete Nth
            // node
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            return;
        }
    }

    public static void insertAtSpecificPosition(int data, int nodePosition) {
        System.out.println("\nInserting data " + data + " at " + nodePosition + " nodePosition in the LL:");
        Node newNode = new Node(data);

        // Check if head is null. If head is null and position is non zero, then we cant
        // add. else we can add the node
        if (nodePosition == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        if (head == null) {
            System.out.println("\nLL is empty. Cannot add the node.");
            return;
        }

        int counter = 0;
        Node temp = head;

        while (temp != null && counter < nodePosition - 1) {
            temp = temp.next;
            counter++;
        }

        if (temp == null) {
            System.out.println("Node Position is invalid.");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("Node added");
        }
    }

    public static void main(String[] args) {
        addNodeAtStart(10);
        printLinkedList();

        addNodeAtEnd(20);
        printLinkedList();

        addNodeAtEnd(30);
        printLinkedList();

        insertAtSpecificPosition(25, 0);
        printLinkedList();
    }
}
