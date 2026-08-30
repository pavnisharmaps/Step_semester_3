package main.java.string.assigment_problems;

import java.util.Scanner;

public class ProductInventoryCSVParser {

    void parseInventoryRecord(String csvLine) {

        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String productName = fields[0].trim();
        String sku = fields[1].trim();
        String quantity = fields[2].trim();

        System.out.println(
                "Product: " + productName
                + " | SKU: " + sku
                + " | Qty: " + quantity);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter inventory record:");
        String csvLine = sc.nextLine();

        ProductInventoryCSVParser parser =
                new ProductInventoryCSVParser();

        parser.parseInventoryRecord(csvLine);

        sc.close();
    }
}