package src.Exercise.Regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String messageInput = scanner.nextLine();
            String decrypted = decryptMessage(messageInput);

            Pattern pattern = Pattern.compile("@(?<Planet>[A-Za-z]+)[^@\\-!:>]*:(?<Population>[0-9]+)[^@\\-!:>]*!(?<Attack>[AD])![^@\\-!:>]*->(?<Soldiers>[0-9]+)");
            Matcher matcher = pattern.matcher(decrypted);

            if (matcher.find()) {
                String planet = matcher.group("Planet");
                String attackType = matcher.group("Attack");

                if (attackType.equals("A")) {
                    attackedPlanets.add(planet);
                } else if (attackType.equals("D")) {
                    destroyedPlanets.add(planet);
                }
            }
        }
        System.out.println("Attacked planets: " + attackedPlanets.size());
        Collections.sort(attackedPlanets);
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));

    }

    private static String decryptMessage(String messageInput) {
        int countLetters = getSpecialLetterCount(messageInput);
        StringBuilder decryptedMessage = new StringBuilder();

        for (char symbol : messageInput.toCharArray()) {
            char newSymbol = (char) (symbol - countLetters);
            decryptedMessage.append(newSymbol);
        }
        return decryptedMessage.toString();
    }

    private static int getSpecialLetterCount(String messageInput) {
        int count = 0;
        for (char symbol : messageInput.toCharArray()) {
            switch (symbol) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
    }
}