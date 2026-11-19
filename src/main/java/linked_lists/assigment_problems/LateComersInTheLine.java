package main.java.linked_lists.assigment_problems;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class LateComersInTheLine {

    public static Node addFirst(Node head, String name) {

        Node newNode = new Node(name);
        newNode.next = head;

        return newNode;
    }

    public static Node addLast(Node head, String name) {

        Node newNode = new Node(name);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    public static void printLine(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node("Asha");
        head.next = new Node("Ravi");

        head = addFirst(head, "Neha");
        head = addLast(head, "Kiran");
        head = addFirst(head, "Mohan");

        printLine(head);
    }
}