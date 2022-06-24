package src.Exercise.MidExamPrep;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\|");

        int health = 100;
        int bitcoins = 0;
        int bestRoom = 0;
        String killedBy = "";
        boolean youAreAlive = true;
        for (int i = 0; i < inputLine.length; i++) {
            String[] roomCommand = inputLine[i].split(" ");
            String command = roomCommand[0];
            int value = Integer.parseInt(roomCommand[1]);

            if (!youAreAlive) {
                break;
            }

            switch (command) {
                case "potion":
                    int healed = 100 - health;
                    health += value;
                    if (health > 100) {
                        health = 100;
                        System.out.printf("You healed for %d hp.%n", healed);
                    } else {
                        System.out.printf("You healed for %d hp.%n", value);
                    }
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoins += value;
                    System.out.printf("You found %d bitcoins.%n", value);
                    break;
                default:
                    health -= value;
                    if (health <= 0) {
                        bestRoom = i + 1;
                        killedBy = command;
                        youAreAlive = false;
                    } else {
                        System.out.printf("You slayed %s.%n", command);
                    }
                    break;
            }
        }
        if (!youAreAlive) {
            System.out.printf("You died! Killed by %s.%n", killedBy);
            System.out.printf("Best room: %d%n", bestRoom);
        } else {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}