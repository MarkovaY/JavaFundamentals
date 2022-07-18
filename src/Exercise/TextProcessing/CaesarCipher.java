package src.Exercise.TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (char symbol : input.toCharArray()) {
            symbol += 3;
            System.out.print(symbol);
        }
    }
}