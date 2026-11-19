package main.java.linked_lists.class_problems;

interface PaymentMode {
    double processPayment(double amount);
    double getFee(double amount);
    String getName();
}

class CashPayment implements PaymentMode {

    public double processPayment(double amount) {
        return amount;
    }

    public double getFee(double amount) {
        return 0;
    }

    public String getName() {
        return "Cash";
    }
}

class CardPayment implements PaymentMode {

    public double processPayment(double amount) {
        return amount * 1.02;
    }

    public double getFee(double amount) {
        return amount * 0.02;
    }

    public String getName() {
        return "Card";
    }
}

class UpiPayment implements PaymentMode {

    public double processPayment(double amount) {
        return amount;
    }

    public double getFee(double amount) {
        return 0;
    }

    public String getName() {
        return "UPI";
    }
}

public class PaymentProcessing {

    public static void main(String[] args) {

        PaymentMode[] payments = {
            new CashPayment(),
            new CardPayment(),
            new UpiPayment(),
            new CardPayment()
        };

        double[] amounts = {1000, 2000, 1500, 3000};

        double total = 0;

        for (int i = 0; i < payments.length; i++) {

            double fee = payments[i].getFee(amounts[i]);
            double processed = payments[i].processPayment(amounts[i]);

            System.out.println(payments[i].getName()
                    + ": amount " + amounts[i]
                    + ", fee " + fee
                    + ", processed " + processed);

            total += processed;
        }

        System.out.println("Total Amount Processed: " + total);
    }
}