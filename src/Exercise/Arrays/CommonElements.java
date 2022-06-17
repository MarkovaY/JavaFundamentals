package src.Exercise.Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrOne = scanner.nextLine().split(" ");
        String[] arrTwo = scanner.nextLine().split(" ");

        for (String elementTwo : arrTwo) {
            for (String elementOne : arrOne) {
                if (elementOne.equals(elementTwo)) {
                    System.out.print(elementOne + " ");
                    break;
                }
            }
        }
    }
}
