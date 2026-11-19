package main.java.linked_lists.class_problems;

class Student {
    private String name;
    private int a, b, c;

    Student(String name) {
        this.name = name;
    }

    boolean setMarks(int a, int b, int c) {
        if (a < 0 || a > 100 ||
            b < 0 || b > 100 ||
            c < 0 || c > 100) {
            return false;
        }

        this.a = a;
        this.b = b;
        this.c = c;
        return true;
    }

    int getTotal() {
        return a + b + c;
    }

    double getAverage() {
        return getTotal() / 3.0;
    }

    String getGrade() {
        double avg = getAverage();

        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        if (avg >= 40) return "D";
        return "F";
    }

    public String toString() {
        return name + " total=" + getTotal()
                + " avg=" + String.format("%.2f", getAverage())
                + " grade=" + getGrade();
    }
}

public class ClassReportCard {

    public static void main(String[] args) {

        Student[] students = new Student[5];
        int count = 0;

        String[] names = {"Asha", "Ravi", "Neha", "Kiran", "Pooja"};

        int[][] marks = {
            {80, 90, 70},
            {60, 65, 70},
            {95, 85, 105},
            {45, 50, 40},
            {88, 72, 81}
        };

        for (int i = 0; i < names.length; i++) {

            Student s = new Student(names[i]);

            if (s.setMarks(marks[i][0], marks[i][1], marks[i][2])) {
                students[count++] = s;
            } else {
                System.out.println(names[i]
                        + " skipped: marks must be 0 to 100");
            }
        }

        int passes = 0;

        for (int i = 0; i < count - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < count - 1 - i; j++) {

                if (students[j].getTotal()
                        < students[j + 1].getTotal()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;

                    swapped = true;
                }
            }

            passes++;

            if (!swapped) {
                break;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }

        System.out.println("Sorted in " + passes + " passes");
    }
}