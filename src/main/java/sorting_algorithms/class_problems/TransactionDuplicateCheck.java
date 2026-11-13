package main.java.sorting_algorithms.class_problems;

import java.util.HashSet;

public class TransactionDuplicateCheck {

    public static boolean hasDuplicate(String[] ids) {

        HashSet<String> set = new HashSet<>();

        for (String id : ids) {
            if (set.contains(id)) {
                return true;
            }

            set.add(id);
        }

        return false;
    }

    public static void main(String[] args) {

        String[] ids1 = {
            "TXN1001", "TXN1002", "TXN1003",
            "TXN1002", "TXN1004"
        };

        String[] ids2 = {
            "TXN2001", "TXN2002", "TXN2003"
        };

        System.out.println(hasDuplicate(ids1));
        System.out.println(hasDuplicate(ids2));
    }
}