package main.java.linked_lists.class_problems;

class Staff {
    String name;
    double baseSalary;

    Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double getBonus() {
        return 0;
    }

    String getType() {
        return "Staff";
    }

    double getTotal() {
        return baseSalary + getBonus();
    }
}

class Teacher extends Staff {

    Teacher(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double getBonus() {
        return 5000;
    }

    @Override
    String getType() {
        return "Teacher";
    }
}

class LabAssistant extends Staff {

    LabAssistant(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double getBonus() {
        return 2000;
    }

    @Override
    String getType() {
        return "LabAssistant";
    }
}

public class CampusStaffSalary {

    public static void main(String[] args) {

        Staff[] staff = {
            new Teacher("Rahul", 30000),
            new LabAssistant("Priya", 20000),
            new Staff("Amit", 25000),
            new Teacher("Sneha", 35000),
            new LabAssistant("Karan", 18000)
        };

        double grandTotal = 0;

        for (Staff s : staff) {
            double bonus = s.getBonus();
            double total = s.getTotal();

            System.out.println(s.name + " (" + s.getType()
                    + "): base " + s.baseSalary
                    + ", bonus " + bonus
                    + ", total " + total);

            grandTotal += total;
        }

        System.out.println("Grand Total Salary: " + grandTotal);
    }
}