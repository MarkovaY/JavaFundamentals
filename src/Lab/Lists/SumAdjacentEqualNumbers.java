package src.Lab.Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            double currentElement = numbersList.get(i);
            double nextElement = numbersList.get(i + 1);
            if (currentElement == nextElement){
                numbersList.set(i, numbersList.get(i) + numbersList.get(i + 1));
                numbersList.remove(i + 1);

                i = -1;
            }
        }
        System.out.println(elementsJoinByDelimiter(numbersList, " "));
    }
    public static String elementsJoinByDelimiter (List <Double> list, String delimiter){
        String result = " ";
        for (Double number : list) {
            DecimalFormat df = new DecimalFormat("0.#");

            String numDF = df.format(number) + delimiter;
            result += numDF;
        }
        return result;
    }
}