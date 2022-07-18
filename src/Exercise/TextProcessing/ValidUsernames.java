package src.Exercise.TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] usernames = input.split(", ");

        for (String username : usernames) {
            if (validUsername(username)) {
                System.out.println(username);
            }
        }
    }

    public static boolean validUsername(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '_' && symbol != '-') {
                return false;
            }
        }
        return true;
    }
}