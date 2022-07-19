package src.Exercise.TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String firstString = input[0];
        String secondString = input[1];

        long sum = calculateSum(firstString, secondString);

        System.out.println(sum);
    }

    private static long calculateSum(String firstString, String secondString) {

        char[] firstArr = firstString.toCharArray();
        char[] secondArr = secondString.toCharArray();
        long sum = 0;
        int minLength = Math.min(firstArr.length, secondArr.length);
        int maxLength = Math.max(firstArr.length, secondArr.length);

        for (int i = 0; i < minLength; i++) {

            sum += (long) firstArr[i] * secondArr[i];
        }


        if (maxLength == firstArr.length) {
            for (int i = minLength; i < maxLength; i++) {
                sum += firstArr[i];
            }
        } else {
            for (int i = minLength; i < maxLength; i++) {
                sum += secondArr[i];
            }
        }

        return sum;
    }
}