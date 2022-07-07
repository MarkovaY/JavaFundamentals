package src.Lab.AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonymsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonymsMap.containsKey(word)) {
                synonymsMap.put(word, new ArrayList<>());
                synonymsMap.get(word).add(synonym);
            } else {
                synonymsMap.get(word).add(synonym);
            }
        }
        for (Map.Entry<String, List<String>> entry : synonymsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}