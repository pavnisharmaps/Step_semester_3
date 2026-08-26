package main.java.loops.assigment_problems;

public class SkipMultiples {
    void printSkippingMultiplesOfThree() {
        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        SkipMultiples sm = new SkipMultiples();
        sm.printSkippingMultiplesOfThree();
    }
}
