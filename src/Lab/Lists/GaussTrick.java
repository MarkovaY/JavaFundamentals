package src.Lab.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sizeList = numbersList.size();
        for (int i = 0; i < sizeList / 2; i++) {
            int firstNumber = numbersList.get(i);
            int lastNumber = numbersList.get(numbersList.size() - 1);

            numbersList.set(i, firstNumber + lastNumber);
            numbersList.remove(numbersList.size() - 1);
        }
        for (int numbers : numbersList) {
            System.out.print(numbers + " ");
        }
    }
}