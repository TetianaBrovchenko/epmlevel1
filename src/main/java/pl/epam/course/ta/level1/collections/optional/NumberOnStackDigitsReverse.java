package pl.epam.course.ta.level1.collections.optional;

import java.util.Scanner;
import java.util.Stack;

public class NumberOnStackDigitsReverse {
    public static void main(String[] args) {
        System.out.print("Пожалуйста, введите число вносимое в стек: ");
        Scanner scan = new Scanner(System.in);
        Integer numberOnStack = scan.nextInt();
        Stack<Integer> stackDigitsNumbers = new Stack<>();
        String numberConvertedToString = Integer.toString(numberOnStack);

        for (int i = 0; i < numberConvertedToString.length(); i++) {
            stackDigitsNumbers.push((int) numberConvertedToString.charAt(i));
        }

        System.out.print("Число из стека в обратном порядке: ");
        int i = numberConvertedToString.length();

        while (i != 0) {
            System.out.print(" " + Character.getNumericValue(stackDigitsNumbers.pop()));
            i--;
        }
    }
}

