package main.java.classes_objects.class_problems;

class Student {
    String name;
    double attendance;

    static String collegeName =
            "SRM Institute of Science and Technology";

    static int studentCount = 0;

    Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class M5_StudentCollege {
    public static void main(String[] args) {

        new Student("Ravi", 90);
        new Student("Anitha", 95);

        Student.printCollegeInfo();
    }
}