package src.Lab.AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> countNumbersMap = new TreeMap<>();

        for (double currentNumber : numbersList) {
            Integer currentValue = countNumbersMap.get(currentNumber);

            if (countNumbersMap.containsKey(currentNumber)) {
                countNumbersMap.put(currentNumber, currentValue + 1);
            } else {
                countNumbersMap.put(currentNumber, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countNumbersMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}