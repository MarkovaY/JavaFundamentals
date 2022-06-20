package src.Lab.Methods;

import java.util.Scanner;

public class CalculateRectangleArea{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = findRectangleArea(width, length);

        System.out.printf("%.0f", area);
    }

    public static double findRectangleArea(double width, double length) {
        double area = width * length;
        return area;
    }
}