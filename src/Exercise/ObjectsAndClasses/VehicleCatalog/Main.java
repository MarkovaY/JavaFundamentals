package src.Exercise.ObjectsAndClasses.VehicleCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> vehiclesList = new ArrayList<>();
        while (!input.equals("End")) {
            String[] inputData = input.split(" ");
            String type = inputData[0];
            String model = inputData[1];
            String color = inputData[2];
            int hp = Integer.parseInt(inputData[3]);

            Vehicle vehicle = new Vehicle(type, model, color, hp);
            vehiclesList.add(vehicle);

            input = scanner.nextLine();
        }

        String enteredModel = scanner.nextLine();
        while (!enteredModel.equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehiclesList) {
                if (enteredModel.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                    break;
                }
            }
            enteredModel = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHP(vehiclesList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.", getAverageHP(vehiclesList, "trucks"));
    }

    private static double getAverageHP(List<Vehicle> vehiclesList, String type) {
        double sum = 0;
        int count = 0;
        if (type.equals("cars")) {
            for (Vehicle vehicle : vehiclesList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHp();
                    count++;
                }
            }
        } else if (type.equals("trucks")) {
            for (Vehicle vehicle : vehiclesList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHp();
                    count++;
                }
            }
        }

        if (sum == 0) {
            return 0;
        }
        return sum / count;
    }
}