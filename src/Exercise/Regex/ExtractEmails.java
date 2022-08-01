package src.Exercise.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\w*[.*-_]*\\w+@[a-z]+.\\w+([.]\\w+)*");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String mail = matcher.group();
            System.out.printf("%s%n", mail);
        }
    }
}