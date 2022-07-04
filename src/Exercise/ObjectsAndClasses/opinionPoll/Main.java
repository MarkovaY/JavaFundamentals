package src.Exercise.ObjectsAndClasses.opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String info = scanner.nextLine();

            String name = info.split(" ")[0];
            int age = Integer.parseInt(info.split(" ")[1]);

            if (age > 30) {
                Person person = new Person(name, age);
                people.add(person);
            }
        }
        for (Person item : people) {
            System.out.printf("%s - %d%n", item.getName(), item.getAge());
        }
    }
}