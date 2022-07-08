package src.Lab.AssociativeArrays;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<String, Integer> wordsMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i].toLowerCase();
            Integer counter = wordsMap.get(currentWord);

            if (wordsMap.containsKey(currentWord)) {
                wordsMap.put(currentWord, counter + 1);
            } else {
                wordsMap.put(currentWord, 1);
            }
        }
        List<String> words = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                words.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", words));
    }
}