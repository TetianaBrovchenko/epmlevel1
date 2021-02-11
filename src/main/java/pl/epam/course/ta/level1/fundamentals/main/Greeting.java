package pl.epam.course.ta.level1.fundamentals.main;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //1.Приветствовать любого пользователя при вводе его имени через командную строку
        System.out.println("Please. Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}
