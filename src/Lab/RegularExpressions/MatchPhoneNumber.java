package src.Lab.RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?:\\+[3][5][9] [2] [0-9]{3} [0-9]{4}\\b|\\+[3][5][9]-[0-9]-[0-9]{3}-[0-9]{4}\\b)");
        Matcher matcher = pattern.matcher(input);

        List<String> numbers = new ArrayList<>();
        while (matcher.find()) {
            String number = matcher.group();
            numbers.add(number);
        }

        System.out.println(String.join(", ", numbers));
    }
}