package src.Exercise.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> types = new ArrayList<>();
        double totalPrice = 0;
        while (!input.equals("Purchase")) {

            Pattern pattern = Pattern.compile(">>([A-Za-z]+)<<^(\\d+)|>>([A-Za-z]+)<<([0-9]+.[0-9]*)(!)(\\d+)");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String type = matcher.group(3);
                double price = Double.parseDouble(matcher.group(4));
                int quantity = Integer.parseInt(matcher.group(6));

                types.add(type);
                totalPrice += price * quantity;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String type : types) {
            System.out.println(type);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}