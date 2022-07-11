package src.Exercise.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> symbolsMap = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {

            if (symbol == ' ') {
                continue;
            }
            if (!symbolsMap.containsKey(symbol)) {
                symbolsMap.put(symbol, 1);
            } else {
                int currentCount = symbolsMap.get(symbol);
                symbolsMap.put(symbol, currentCount + 1);
            }
        }
        symbolsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}