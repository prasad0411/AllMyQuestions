package linkedList;

public class Basics {

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
        printLinkedList();
    }

    public static void addNodeAtEnd(int n) {
        System.out.println("\nAdding a node " + n + " at the end of the LL: ");

        Node newNode = new Node(n);

        // Since there may be 0 nodes in the LL, we check only using head, no need of
        // temp, as we are not traversing
        if (head == null) {
            System.out.println("\nLL is empty. So adding the node at the first position.");
            head = newNode;
        } else {
            // Since LL is not empty, we need to traverse and put the node at the end of LL
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        printLinkedList();
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
        printLinkedList();
    }

    public static void deleteNodeFromEnd() {
        System.out.println("\nDeleting a node from the end of LL:");

        //
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
            printLinkedList();
            return;
        }
    }

    public static void main(String[] args) {
        addNodeAtStart(10);
        deleteNodeFromEnd();
    }
}
