package main.java.sorting_algorithms.class_problems;

import java.util.HashMap;

public class EmployeeIDLookup {

    public static HashMap<String, String> buildLookup(
            String[] ids, String[] departments) {

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < ids.length; i++) {
            map.put(ids[i], departments[i]);
        }

        return map;
    }

    public static String getDepartment(
            HashMap<String, String> map, String employeeId) {

        if (map.containsKey(employeeId)) {
            return map.get(employeeId);
        }

        return "Unknown";
    }

    public static void main(String[] args) {

        String[] ids = {"E245", "E110", "E390", "E101"};

        String[] departments = {
            "Finance", "Engineering", "Marketing", "Engineering"
        };

        HashMap<String, String> lookup =
                buildLookup(ids, departments);

        System.out.println(getDepartment(lookup, "E390"));
        System.out.println(getDepartment(lookup, "E999"));
    }
}