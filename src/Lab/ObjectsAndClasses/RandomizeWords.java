package src.Lab.ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sentence = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!sentence.isEmpty()) {
            Random rnd = new Random();
            int index = rnd.nextInt(sentence.size());

            String word = sentence.get(index);

            System.out.println(word);

            sentence.remove(index);
        }
    }
}