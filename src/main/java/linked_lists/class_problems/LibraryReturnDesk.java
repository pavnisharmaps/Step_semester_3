package main.java.linked_lists.class_problems;

public class LibraryReturnDesk {

    public static void main(String[] args) {

        String[] stack = new String[3];
        String[] queue = new String[3];

        int top = -1;
        int front = 0;
        int rear = -1;
        int size = 0;

        // RETURN B1
        if (top < 2) {
            stack[++top] = "B1";
            System.out.println("B1 placed on pile");
        }

        // RETURN B2
        if (top < 2) {
            stack[++top] = "B2";
            System.out.println("B2 placed on pile");
        }

        // RETURN B3
        if (top < 2) {
            stack[++top] = "B3";
            System.out.println("B3 placed on pile");
        }

        // RETURN B4
        if (top == 2) {
            System.out.println("B4 rejected: pile is full");
        }

        // WAIT Asha
        rear = (rear + 1) % 3;
        queue[rear] = "Asha";
        size++;
        System.out.println("Asha joined the line");

        // WAIT Ravi
        rear = (rear + 1) % 3;
        queue[rear] = "Ravi";
        size++;
        System.out.println("Ravi joined the line");

        // SHELVE
        if (top >= 0) {
            System.out.println("shelved " + stack[top--]);
        }

        // SERVE
        if (size > 0) {
            System.out.println("served " + queue[front]);
            front = (front + 1) % 3;
            size--;
        }

        // SHELVE
        if (top >= 0) {
            System.out.println("shelved " + stack[top--]);
        }

        // SHELVE
        if (top >= 0) {
            System.out.println("shelved " + stack[top--]);
        }

        // SHELVE
        if (top < 0) {
            System.out.println("pile is empty");
        }

        // SERVE
        if (size > 0) {
            System.out.println("served " + queue[front]);
            front = (front + 1) % 3;
            size--;
        }

        // SERVE
        if (size == 0) {
            System.out.println("no one waiting");
        }
    }
}