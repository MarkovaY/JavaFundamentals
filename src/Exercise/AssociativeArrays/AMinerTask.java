package src.Exercise.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> resourcesMap = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourcesMap.containsKey(input)) {
                resourcesMap.put(input, quantity);
            } else {
                int currentQuantity = resourcesMap.get(input);
                resourcesMap.put(input, currentQuantity + quantity);
            }
            input = scanner.nextLine();
        }
        resourcesMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}