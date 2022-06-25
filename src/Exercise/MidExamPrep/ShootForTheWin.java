package src.Exercise.MidExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targetsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String commandInput = scanner.nextLine();

        int totalShots = 0;
        int currentTarget;
        while (!commandInput.equals("End")) {

            int index = Integer.parseInt(commandInput);
            if (index > targetsArr.length - 1) {
                commandInput = scanner.nextLine();
                continue;
            }
            if (targetsArr[index] == -1) {
                commandInput = scanner.nextLine();
                continue;
            }

            currentTarget = targetsArr[index];
            for (int i = 0; i < targetsArr.length; i++) {

                targetsArr[index] = -1;
                if (targetsArr[i] <= currentTarget && targetsArr[i] != -1) {
                    targetsArr[i] += currentTarget;
                } else if (targetsArr[i] > currentTarget && targetsArr[i] != -1) {
                    targetsArr[i] -= currentTarget;
                }
            }
            totalShots++;
            commandInput = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", totalShots);
        for (int numbers : targetsArr) {
            System.out.print(numbers + " ");
        }
    }
}