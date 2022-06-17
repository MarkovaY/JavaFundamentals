package src.Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandType = commandParts[0];

            switch (commandType) {
                case "swap":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int element1 = array[index1];
                    int index2 = Integer.parseInt(commandParts[2]);
                    int element2 = array[index2];

                    array[index1] = element2;
                    array[index2] = element1;
                    break;
                case "multiply":
                    int index1Multiply = Integer.parseInt(commandParts[1]);
                    int multiplyElement1 = array[index1Multiply];
                    int index2Multiply = Integer.parseInt(commandParts[2]);
                    int multiplyElement2 = array[index2Multiply];

                    int product = multiplyElement1 * multiplyElement2;
                    array[index1Multiply] = product;
                    break;
                case "decrease":
                    for (int i = 0; i < array.length; i++) {
                        array[i] -= 1;
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i <= array.length - 1; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
    }
}