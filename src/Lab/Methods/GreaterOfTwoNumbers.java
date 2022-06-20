package src.Lab.Methods;

import java.util.Scanner;

public class GreaterOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueType = scanner.nextLine();

        switch (valueType) {
            case "int":
                int valueOne = Integer.parseInt(scanner.nextLine());
                int valueTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(valueOne, valueTwo));
                break;
            case "char":
                char valueCharOne = scanner.nextLine().charAt(0);
                char valueCharTwo = scanner.nextLine().charAt(0);
                System.out.println(getMax(valueCharOne, valueCharTwo));
                break;
            case "string":
                String valueStringOne = scanner.nextLine();
                String valueStringTwo = scanner.nextLine();
                System.out.println(getMax(valueStringOne, valueStringTwo));
                break;
        }

    }

    public static int getMax(int valueOne, int valueTwo) {
        if (valueOne > valueTwo) {
            return valueOne;
        }
        return valueTwo;
    }

    public static char getMax(char valueCharOne, char valueCharTwo) {
        if (valueCharOne > valueCharTwo) {
            return valueCharOne;
        }
        return valueCharTwo;
    }

    public static String getMax(String valueStringOne, String valueStringTwo) {
        String result;
        if (valueStringOne.compareTo(valueStringTwo) > 0) {
            result = valueStringOne;
        } else {
            result = valueStringTwo;
        }
        return result;
    }
}