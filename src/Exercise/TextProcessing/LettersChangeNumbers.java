package src.Exercise.TextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] codes = input.split("\\s+");


        double totalSum = 0;
        for (String code : codes) {
            double number = getModifiedNumber(code);
            totalSum += number;
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNumber(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);

        double num = Double.parseDouble(code.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());

        if (Character.isUpperCase(firstLetter)) {
            int positionInAlphabet = (int) firstLetter - 64;
            num /= positionInAlphabet;
        } else if (Character.isLowerCase(firstLetter)) {
            int positionInAlphabet = (int) firstLetter - 96;
            num *= positionInAlphabet;
        }

        if (Character.isUpperCase(secondLetter)) {
            int positionInAlphabet = (int) secondLetter - 64;
            num -= positionInAlphabet;
        } else if (Character.isLowerCase(secondLetter)) {
            int positionInAlphabet = (int) secondLetter - 96;
            num += positionInAlphabet;
        }

        return num;
    }
}