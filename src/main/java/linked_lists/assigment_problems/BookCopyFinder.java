package main.java.linked_lists.assigment_problems;

class BookNode {
    String data;
    BookNode next;

    BookNode(String data) {
        this.data = data;
    }
}

public class BookCopyFinder {

    public static String find(BookNode head, String id) {

        int position = 1;
        int firstPosition = -1;
        int copies = 0;

        BookNode temp = head;

        while (temp != null) {

            if (temp.data.equals(id)) {

                if (firstPosition == -1) {
                    firstPosition = position;
                }

                copies++;
            }

            temp = temp.next;
            position++;
        }

        if (copies == 0) {
            return id + " not found";
        }

        return id + " first at position " + firstPosition
                + ", copies: " + copies;
    }

    public static void main(String[] args) {

        BookNode head = new BookNode("B12");
        head.next = new BookNode("B07");
        head.next.next = new BookNode("B30");
        head.next.next.next = new BookNode("B07");
        head.next.next.next.next = new BookNode("B45");
        head.next.next.next.next.next = new BookNode("B07");

        System.out.println(find(head, "B07"));
        System.out.println(find(head, "B99"));
    }
}