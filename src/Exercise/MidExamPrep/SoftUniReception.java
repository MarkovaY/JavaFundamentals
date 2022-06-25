package src.Exercise.MidExamPrep;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeOne = Integer.parseInt(scanner.nextLine());
        int employeeTwo = Integer.parseInt(scanner.nextLine());
        int employeeThree = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        int totalStudentsPerHr = employeeOne + employeeTwo + employeeThree;
        int hoursPassed = 0;

        while (students > 0) {
            hoursPassed++;
            if (hoursPassed % 4 != 0) {
                students -= totalStudentsPerHr;
            }
        }
        System.out.printf("Time needed: %dh.", hoursPassed);
    }
}