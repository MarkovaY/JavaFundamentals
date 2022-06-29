package src.Exercise.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double sum = 0;
        while (!command.equals("Start")) {

            switch (command) {
                case "0.1":
                    sum += 0.1;
                    break;
                case "0.2":
                    sum += 0.2;
                    break;
                case "0.5":
                    sum += 0.5;
                    break;
                case "1":
                    sum += 1;
                    break;
                case "2":
                    sum += 2;
                    break;
                default:
                    double invalid = Double.parseDouble(command);
                    System.out.printf("Cannot accept %.2f%n", invalid);
                    break;
            }
            command = scanner.nextLine();
        }

        String command2 = scanner.nextLine();
        boolean isValid = true;
        while (!command2.equals("End")) {

            double price = 0;
            switch (command2) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    isValid = false;
                    System.out.println("Invalid product");
                    break;
            }
            if (sum - price < 0) {
                System.out.println("Sorry, not enough money");
            } else if (isValid){
                sum -= price;
                System.out.printf("Purchased %s%n", command2);
            }

            command2 = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}