package pl.epam.course.ta.level1.fundamentals.main;

import java.util.Arrays;
import java.util.Scanner;

public class OutputtingRandomNumbers {
    public static void main(String[] args) {
        //3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the required number of random numbers: ");
        int j = scanner.nextInt();
        int[] array = new int[j];
        for (int i = 0; i < j; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        System.out.print("Output of the numbers without a new line: " + Arrays.toString(array));
    }
}
