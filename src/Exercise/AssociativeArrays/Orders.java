package src.Exercise.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> singlePrice = new LinkedHashMap<>();

        while (!input.equals("buy")) {

            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            singlePrice.put(product, price);

            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            } else {
                int currentQuantity = productsQuantity.get(product);
                productsQuantity.put(product, currentQuantity + quantity);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : singlePrice.entrySet()) {
            String product = entry.getKey();
            double totalSum = entry.getValue() * productsQuantity.get(product);
            System.out.printf("%s -> %.2f%n", product, totalSum);
        }
    }
}