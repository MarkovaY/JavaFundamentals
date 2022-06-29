package src.Exercise.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfGroup = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalPrice = 0;
        switch (typeGroup) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        totalPrice = countOfGroup * 8.45;
                        if (countOfGroup >= 30) {
                            totalPrice -= totalPrice * 0.15;
                        }
                        break;
                    case "Saturday":
                        totalPrice = countOfGroup * 9.80;
                        if (countOfGroup >= 30) {
                            totalPrice -= totalPrice * 0.15;
                        }
                        break;
                    case "Sunday":
                        totalPrice = countOfGroup * 10.46;
                        if (countOfGroup >= 30) {
                            totalPrice -= totalPrice * 0.15;
                        }
                        break;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        totalPrice = countOfGroup * 10.90;
                        if (countOfGroup >= 100) {
                            totalPrice = (countOfGroup - 10) * 10.90;
                        }
                        break;
                    case "Saturday":
                        totalPrice = countOfGroup * 15.60;
                        if (countOfGroup >= 100) {
                            totalPrice = (countOfGroup - 10) * 15.60;
                        }
                        break;
                    case "Sunday":
                        totalPrice = countOfGroup * 16;
                        if (countOfGroup >= 100) {
                            totalPrice = (countOfGroup - 10) * 16;
                        }
                        break;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        totalPrice = countOfGroup * 15;
                        if (countOfGroup >= 10 && countOfGroup <= 20) {
                            totalPrice -= totalPrice * 0.05;
                        }
                        break;
                    case "Saturday":
                        totalPrice = countOfGroup * 20;
                        if (countOfGroup >= 10 && countOfGroup <= 20) {
                            totalPrice -= totalPrice * 0.05;
                        }
                        break;
                    case "Sunday":
                        totalPrice = countOfGroup * 22.50;
                        if (countOfGroup >= 10 && countOfGroup <= 20) {
                            totalPrice -= totalPrice * 0.05;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}