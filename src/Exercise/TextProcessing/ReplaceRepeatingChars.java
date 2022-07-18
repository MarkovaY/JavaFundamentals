package src.Exercise.TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder replacement = new StringBuilder();

        char firstOccurrence = input.charAt(0);
        replacement.append(firstOccurrence);

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol != firstOccurrence) {
                replacement.append(currentSymbol);
                firstOccurrence = currentSymbol;
            }
        }
        System.out.println(replacement);
    }
}