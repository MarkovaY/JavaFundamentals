package src.Lab.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while (!commands.equals("end")) {

            List<String> commandLine = Arrays.stream(commands.split(" ")).collect(Collectors.toList());

            String command = commandLine.get(0);

            int item = 0;
            switch (command) {
                case "Add":
                    item = Integer.parseInt(commandLine.get(1));
                    numbersList.add(item);
                    break;
                case "Remove":
                    item = Integer.parseInt(commandLine.get(1));
                    numbersList.remove(Integer.valueOf(item));
                    break;
                case "RemoveAt":
                    item = Integer.parseInt(commandLine.get(1));
                    numbersList.remove(item);
                    break;
                case "Insert":
                    item = Integer.parseInt(commandLine.get(2));
                    int insertItem = Integer.parseInt(commandLine.get(1));
                    numbersList.add(item, insertItem);
                    break;
            }
            commands = scanner.nextLine();
        }
        for (int numbers : numbersList) {
            System.out.print(numbers + " ");
        }
    }
}
