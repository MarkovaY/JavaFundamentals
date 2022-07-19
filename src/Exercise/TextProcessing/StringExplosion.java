package src.Exercise.TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder explosions = new StringBuilder(input);

        int power = 0;
        for (int i = 0; i < explosions.length(); i++) {
            char currentSymbol = explosions.charAt(i);

            if (currentSymbol == '>'){
                int currentPower = Integer.parseInt(explosions.charAt(i + 1) + "");
                power += currentPower;
            } else if (currentSymbol != '>' && power > 0){
                explosions.deleteCharAt(i);
                power --;
                i --;
            }
        }
        System.out.println(explosions);
    }
}