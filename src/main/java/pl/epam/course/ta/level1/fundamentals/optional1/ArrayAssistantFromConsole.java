package pl.epam.course.ta.level1.fundamentals.optional1;

import java.util.Random;
import java.util.Scanner;

public class ArrayAssistantFromConsole {
    //Задание. Ввести n чисел с консоли.
    public static int[] createArrayOfNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("введите размер массива");
        int l = in.nextInt();
        int[] arrayOfNumbers = new int[l];
        System.out.println("введите масив");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = in.nextInt();
        }
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + "  ");
        }
        System.out.println();

        return arrayOfNumbers;
    }
}
