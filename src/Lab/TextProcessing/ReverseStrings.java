package src.Lab.TextProcessing;

import java.util.List;
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String reversedWord = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                char currentChar = input.charAt(i);
                reversedWord += currentChar;
            }

            System.out.printf("%s = %s%n", input, reversedWord);
            input = scanner.nextLine();
        }
    }
}