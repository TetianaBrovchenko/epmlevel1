package pl.epam.course.ta.level1.fundamentals.main;

import java.util.Scanner;

public class NumbersMonth {
    public static void main(String[] args) {
        //5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
        System.out.print("Please enter the number of month: ");
        Scanner scan = new Scanner(System.in);
        int monthNumber  = scan.nextInt();
        System.out.println(findMonthByNumber(monthNumber));
    }

    public static String findMonthByNumber(int monthNumber) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (monthNumber > 0 && monthNumber <= month.length) {
            return month[monthNumber-1];
        }
        return "Month not found";
    }

}

