package src.Lab.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {

        String firstName;
        String secondName;
        String age;
        String city;

        public Student(String firstName, String secondName, String age, String city) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.city = city;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getSecondName() {
            return this.secondName;
        }

        public String getAge() {
            return this.age;
        }

        public String getCity() {
            return this.city;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();
        while (!input.equals("end")) {
            String[] inputArr = input.split(" ");
            String firstName = inputArr[0];
            String secondName = inputArr[1];
            String age = inputArr[2];
            String city = inputArr[3];

            Student currentStudent = new Student(firstName, secondName, age, city);
            studentList.add(currentStudent);

            input = scanner.nextLine();
        }

        String whichCity = scanner.nextLine();

        for (Student item : studentList) {
            if (item.city.equals(whichCity)) {
                System.out.printf("%s %s is %s years old%n", item.getFirstName(), item.getSecondName(), item.getAge());
            }
        }
    }
}