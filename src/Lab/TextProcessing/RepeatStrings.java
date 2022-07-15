package src.Lab.TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<String> repeatList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];
            int length = currentWord.length();

            String repeatWord = repeatString(currentWord, length);
            repeatList.add(repeatWord);
        }
        System.out.println(String.join("", repeatList));
    }

    public static String repeatString(String string, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += string;
        }
        return result;
    }
}