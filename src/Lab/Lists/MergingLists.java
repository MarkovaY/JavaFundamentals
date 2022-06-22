package src.Lab.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultsList = new ArrayList<>();

        int minSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minSize; i++) {
            int firstNum = firstList.get(i);
            int secondNum = secondList.get(i);

            resultsList.add(firstNum);
            resultsList.add(secondNum);
        }

        if (firstList.size() > secondList.size()) {
            resultsList.addAll(firstList.subList(minSize, firstList.size()));
        } else {
            resultsList.addAll(secondList.subList(minSize, secondList.size()));
        }
        for (int numbers : resultsList) {
            System.out.print(numbers + " ");
        }
    }
}
