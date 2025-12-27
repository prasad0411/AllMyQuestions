package linkedList;

public class Basics {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void printLinkedList() {
        System.out.println("Printing Linked List: ");
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Basics list = new Basics();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.printLinkedList();
    }
}
