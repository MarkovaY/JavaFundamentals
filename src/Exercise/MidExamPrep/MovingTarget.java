package src.Exercise.MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetValues = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String commandsInput = scanner.nextLine();

        while (!commandsInput.equals("End")) {
            String[] commandLine = commandsInput.split(" ");
            String commands = commandLine[0];
            int index = Integer.parseInt(commandLine[1]);
            int value = Integer.parseInt(commandLine[2]);

            switch (commands) {
                case "Shoot":
                    if (indexExists(targetValues, index)) {
                        int currentTarget = targetValues.get(index);
                        currentTarget -= value;
                        if (currentTarget <= 0) {
                            targetValues.remove(index);
                        } else {
                            targetValues.set(index, currentTarget);
                        }
                    }
                    break;
                case "Add":
                    if (indexExists(targetValues, index)) {
                        targetValues.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    boolean validIndexRadius = targetValues.size() - 1 >= index && targetValues.size() - 1 >= index + value && index - value >= 0;
                    if (validIndexRadius) {
                        int radius = value * 2 + 1;
                        for (int i = 0; i < radius; i++) {
                            targetValues.remove(index - value);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            commandsInput = scanner.nextLine();
        }
        List<String> resultList = new ArrayList<>();
        for (int values : targetValues) {
            resultList.add(String.valueOf(values));
        }
        System.out.println(String.join("|", resultList));
    }

    public static boolean indexExists(List<Integer> list, int index) {
        return index <= list.size() - 1 && index >= 0;
    }
}