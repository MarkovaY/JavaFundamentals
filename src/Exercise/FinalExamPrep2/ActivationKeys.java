package src.Exercise.FinalExamPrep2;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawActivKey = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder endString = new StringBuilder(rawActivKey);
        while (!command.equals("Generate")) {

            String instruction = command.split(">>>")[0];

            switch (instruction) {
                case "Contains":
                    String substring = command.split(">>>")[1];
                    if (endString.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", endString, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String letterCase = command.split(">>>")[1];
                    int startIndex = Integer.parseInt(command.split(">>>")[2]);
                    int endIndex = Integer.parseInt(command.split(">>>")[3]);
                    String substringToChange = endString.substring(startIndex, endIndex);
                    if (letterCase.equals("Upper")) {
                        endString.replace(startIndex, endIndex, substringToChange.toUpperCase());
                        System.out.println(endString);
                    } else if (letterCase.equals("Lower")) {
                        endString.replace(startIndex, endIndex, substringToChange.toLowerCase());
                        System.out.println(endString);
                    }
                    break;
                case "Slice":
                    int startIndexDel = Integer.parseInt(command.split(">>>")[1]);
                    int endIndexDel = Integer.parseInt(command.split(">>>")[2]);

                    endString.delete(startIndexDel, endIndexDel);
                    System.out.println(endString);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + endString);
    }
}