package src.Exercise.FinalExamPrep1;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder travelProgress = new StringBuilder(stops);
        StringBuilder finalStops = new StringBuilder();
        while (!command.equals("Travel")) {

            String currentCommand = command.split(":")[0];
            switch (currentCommand) {
                case "Add Stop":
                    int index = Integer.parseInt(command.split(":")[1]);
                    String additionalStop = command.split(":")[2];

                    if (isValidIndex(index, travelProgress)) {
                        travelProgress.insert(index, additionalStop);
                    }
                    System.out.println(travelProgress);
                    break;
                case "Remove Stop":
                    int index1 = Integer.parseInt(command.split(":")[1]);
                    int index2 = Integer.parseInt(command.split(":")[2]);
                    if (isValidIndex(index1, travelProgress) && isValidIndex(index2, travelProgress)) {
                        travelProgress.delete(index1, index2 + 1);
                    }
                    System.out.println(travelProgress);

                    break;
                case "Switch":
                    String oldString = command.split(":")[1];
                    String newString = command.split(":")[2];
                    if (travelProgress.toString().contains(oldString)) {
                        String newReplaced = travelProgress.toString().replace(oldString, newString);
                        travelProgress = new StringBuilder(newReplaced);
                    }
                    System.out.println(travelProgress);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + travelProgress);


    }

    public static boolean isValidIndex(int index, StringBuilder stringBuilder) {
        return index >= 0 && index <= stringBuilder.length() - 1;
    }
}