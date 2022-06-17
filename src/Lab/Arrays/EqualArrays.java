package src.Lab.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean areEqual = false;
        for (int i = 0; i < arrOne.length; i++) {
            sum += arrOne[i];

            if (arrOne[i] != arrTwo[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areEqual = false;
                break;
            } else {
                areEqual = true;
            }
        }
        if (areEqual){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}