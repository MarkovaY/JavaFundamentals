package src.Exercise.TextProcessing;

import java.util.List;
import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        String[] folders = path.split("\\\\");

        String fileName = folders[folders.length - 1].split("\\.")[0];
        String extension = folders[folders.length - 1].split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}