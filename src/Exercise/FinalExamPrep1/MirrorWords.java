package src.Exercise.FinalExamPrep1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(#|@)(?<Word1>[A-za-z]{3,})\\1\\1(?<Word2>[A-za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);

        List<String> mirrorWords = new ArrayList<>();
        int counterMatches = 0;

        while (matcher.find()) {
            String firstWord = matcher.group("Word1");
            String secondWord = matcher.group("Word2");

            StringBuilder secondWordBuilder = new StringBuilder(secondWord);
            String reversedSecondWord = secondWordBuilder.reverse().toString();
            if (firstWord.equals(reversedSecondWord)) {
                mirrorWords.add(firstWord + " <=> " + secondWord);

            }
            counterMatches++;
        }
        if (counterMatches == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", counterMatches);
        }
        if (mirrorWords.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are: ");
            System.out.println(String.join(", ", mirrorWords));
        }
    }
}