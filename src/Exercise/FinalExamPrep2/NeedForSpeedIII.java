package src.Exercise.FinalExamPrep2;

import java.util.*;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carNumber = Integer.parseInt(scanner.nextLine());

        Map<String, List> allCars = new LinkedHashMap<>();

        for (int i = 0; i < carNumber; i++) {
            String cars = scanner.nextLine();

            String carModel = cars.split("\\|")[0];
            int mileage = Integer.parseInt(cars.split("\\|")[1]);
            int currentFuel = Integer.parseInt(cars.split("\\|")[2]);

            List<Integer> carAttributes = new ArrayList<>();
            carAttributes.add(mileage);
            carAttributes.add(currentFuel);

            allCars.put(carModel, carAttributes);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {

            String action = command.split(" : ")[0];

            switch (action) {
                case "Drive":
                    String currentCar = command.split(" : ")[1];
                    int distance = Integer.parseInt(command.split(" : ")[2]);
                    int fuel = Integer.parseInt(command.split(" : ")[3]);

                    List<Integer> currentCarAttributes = allCars.get(currentCar);
                    if (fuel > currentCarAttributes.get(1)) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int mileage = currentCarAttributes.get(0);
                        mileage += distance;
                        currentCarAttributes.set(0, mileage);
                        int currentFuel = currentCarAttributes.get(1);
                        currentFuel -= fuel;
                        currentCarAttributes.set(1, currentFuel);
                        allCars.put(currentCar, currentCarAttributes);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", currentCar, distance, fuel);
                        if (mileage >= 100000) {
                            System.out.println("Time to sell the " + currentCar + "!");
                            allCars.remove(currentCar);
                        }
                    }
                    break;
                case "Refuel":
                    String currentCarRefuel = command.split(" : ")[1];
                    int addFuel = Integer.parseInt(command.split(" : ")[2]);
                    List<Integer> currentCarFuel = allCars.get(currentCarRefuel);
                    int currentFuel = currentCarFuel.get(1);
                    if (addFuel + currentFuel > 75) {
                        addFuel = 75 - currentFuel;
                        currentFuel = 75;
                        currentCarFuel.set(1, currentFuel);
                        System.out.printf("%s refueled with %d liters%n", currentCarRefuel, addFuel);
                    } else {
                        currentFuel += addFuel;
                        currentCarFuel.set(1, currentFuel);
                        System.out.printf("%s refueled with %d liters%n", currentCarRefuel, addFuel);
                    }
                    allCars.put(currentCarRefuel, currentCarFuel);
                    break;
                case "Revert":
                    String carDecrease = command.split(" : ")[1];
                    int decreaseKM = Integer.parseInt(command.split(" : ")[2]);

                    List<Integer> currentCarDecrease = allCars.get(carDecrease);
                    int currentMileage = currentCarDecrease.get(0);
                    currentMileage -= decreaseKM;
                    if (currentMileage <= 10000) {
                        currentMileage = 10000;
                        currentCarDecrease.set(0, currentMileage);
                    } else {
                        currentCarDecrease.set(0, currentMileage);
                        System.out.printf("%s mileage decreased by %d kilometers%n", carDecrease, decreaseKM);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        allCars.entrySet().forEach(entry -> System.out.printf("%s -> Mileage: %s kms, Fuel in the tank: %s lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}