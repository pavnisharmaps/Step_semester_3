package main.java.linked_lists.assigment_problems;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class BusRouteStops {

    public static Node build(String[] stops) {

        Node head = null;
        Node tail = null;

        for (String stop : stops) {
            Node newNode = new Node(stop);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    public static void printRoute(Node head) {

        Node temp = head;
        int count = 0;
        String first = head.data;
        String last = "";

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            last = temp.data;
            count++;
            temp = temp.next;
        }

        System.out.println("null");

        System.out.println("Stops: " + count
                + ", First: " + first + ", Last: " + last);
    }

    public static void main(String[] args) {

        String[] stops = {
            "Tambaram", "Guindy", "TNagar", "Central"
        };

        Node head = build(stops);

        printRoute(head);
    }
}