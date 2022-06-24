package src.Exercise.Methods;

import java.util.*;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println(vowelsCounter(text));
    }

    public static int vowelsCounter(String text) {
        int counter = 0;
        // A, E, I, O, U, Y, W
        for (char letter : text.toCharArray()) {
            if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') {
                counter++;
            }
        }
        return counter;
    }
}