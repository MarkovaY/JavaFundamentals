package src.Exercise.TextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger number1 = new BigInteger(scanner.nextLine());
        BigInteger number2 = new BigInteger(scanner.nextLine());

        System.out.println(number1.multiply(number2));
    }
}