package src.Exercise.MidExamPrep;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double sum = 0;
        while (!command.equals("special") && !command.equals("regular")) {

            double pricePerPiece = Double.parseDouble(command);

            if (pricePerPiece < 0) {
                System.out.println("Invalid price!");
                command = scanner.nextLine();
                continue;
            }

            sum += pricePerPiece;

            command = scanner.nextLine();
        }
        if (sum == 0) {
            System.out.print("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", sum * 0.2);
            System.out.println("-----------");

            double totalPrice = sum + (sum * 0.2);
            if (command.equals("special")) {
                double specialPrice = totalPrice - (totalPrice * 0.1);
                System.out.printf("Total price: %.2f$", specialPrice);
            } else {
                totalPrice = sum + (sum * 0.2);
                System.out.printf("Total price: %.2f$", totalPrice);
            }
        }
    }
}
