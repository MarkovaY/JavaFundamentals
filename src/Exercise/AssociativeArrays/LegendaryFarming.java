package src.Exercise.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean inProgress = true;
        while (inProgress) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");

            for (int i = 0; i < inputData.length - 1; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        int currentJunk = junk.get(material);
                        junk.put(material, currentJunk + quantity);
                    }
                }

                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    int current = materials.get("shards");
                    materials.put("shards", current - 250);
                    inProgress = false;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    int current = materials.get("fragments");
                    materials.put("fragments", current - 250);
                    inProgress = false;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    int current = materials.get("motes");
                    materials.put("motes", current - 250);
                    inProgress = false;
                    break;
                }
            }
            if (!inProgress) {
                break;
            }
        }
        materials.forEach((key, value) -> System.out.println(key + ": " + value));
        junk.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}