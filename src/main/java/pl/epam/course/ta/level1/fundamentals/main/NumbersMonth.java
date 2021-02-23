package pl.epam.course.ta.level1.fundamentals.main;

import java.util.Scanner;

public class NumbersMonth {
    public static void main(String[] args) {
        //5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
        System.out.print("Please enter the number of month: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(solve(n));
    }

    public static String solve(int n) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (n > 0 && n <= month.length) {
            return month[n-1];
        }
        return "Month not found";
    }

}

