package src.Lab.TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();

        int index = text2.indexOf(text1);
        while (index != -1) {

            text2 = text2.replace(text1, "");

            index = text2.indexOf(text1);
        }
        System.out.println(text2);
    }
}