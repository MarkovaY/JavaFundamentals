package src.Lab.Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(returnString(string, count));
    }

    public static String returnString (String string, int count) {
        String result = "";
        for (int i = 1; i <= count; i++) {
            result += string;
        }
        return result;
    }
}