package pl.epam.course.ta.level1.fundamentals.main;

import java.util.Scanner;

public class CommandLineArguments {
    public static void main(String[] args) {
        //2.	Отобразить в окне консоли аргументы командной строки в обратном порядке.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter numbers : ");
        int value = scanner.nextInt();
        int reversdigits = 0;
        while (value != 0) {
            reversdigits = reversdigits * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("Output of the reverse sequence of digits of a number: " + reversdigits);

    }
}
