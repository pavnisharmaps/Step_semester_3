package main.java.linked_lists.assigment_problems;

class BookingNode {
    String data;
    BookingNode next;

    BookingNode(String data) {
        this.data = data;
    }
}

public class CancelABooking {

    public static BookingNode removeFirst(
            BookingNode head, String booking) {

        if (head == null) {
            System.out.println(booking + " not found");
            return null;
        }

        if (head.data.equals(booking)) {
            return head.next;
        }

        BookingNode temp = head;

        while (temp.next != null
                && !temp.next.data.equals(booking)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(booking + " not found");
        } else {
            temp.next = temp.next.next;
        }

        return head;
    }

    public static void printList(BookingNode head) {

        BookingNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        BookingNode head = new BookingNode("104");
        head.next = new BookingNode("101");
        head.next.next = new BookingNode("107");
        head.next.next.next = new BookingNode("101");

        head = removeFirst(head, "101");
        printList(head);

        head = removeFirst(head, "200");
        printList(head);
    }
}