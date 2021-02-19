package pl.epam.course.ta.level1.fundamentals.optional1;

import java.util.Arrays;

import static pl.epam.course.ta.level1.fundamentals.optional1.ArrayAssistantFromConsole.createArrayOfNumbers;

public class AverageNumberLength {
    //  3.     Вывести на консоль те числа, длина которых меньше средней длины по всем числам, а также длину.
    public static void main(String[] args) {
        int[] newArrayForOptionalTask1_3 = createArrayOfNumbers();

        int[] arrayOfNumberLengths = createArrayOfNumberLengths(newArrayForOptionalTask1_3);

        System.out.println("Длины чисел массива = " + Arrays.toString(arrayOfNumberLengths));

        double averageLengthsOfNumbers = calculateAverageLengthOfNumbers(arrayOfNumberLengths);

        System.out.println("Средняя длина чисел массива = " + averageLengthsOfNumbers);

        printResults(newArrayForOptionalTask1_3, arrayOfNumberLengths, averageLengthsOfNumbers);

    }

    private static int[] createArrayOfNumberLengths(int[] newArrayForOptionalTask1_3) {
        int[] createArrayOfNumbersLengths = new int[newArrayForOptionalTask1_3.length];

        for (int i = 0; i < newArrayForOptionalTask1_3.length; i++) {
            createArrayOfNumbersLengths[i] = String.valueOf(Math.abs(newArrayForOptionalTask1_3[i])).length();
        }

        return createArrayOfNumbersLengths;
    }

    private static double calculateAverageLengthOfNumbers(int[] arrayOfNumberLengths) {
        double averageLengthOfNumbers = arrayOfNumberLengths[0];
        for (int i = 0; i < arrayOfNumberLengths.length - 1; i++) {
            averageLengthOfNumbers += arrayOfNumberLengths[i];
        }
        averageLengthOfNumbers /= (arrayOfNumberLengths.length);
        return averageLengthOfNumbers;
    }

    private static void printResults(int[] newArrayForOptionalTask1_3, int[] arrayOfNumberLengths, double averageLengthsOfNumbers) {
        System.out.print("Числа, длина которых меньше средней длины чисел массива и их длины: ");
        for (int i = 0; i < newArrayForOptionalTask1_3.length - 1; i++) {
            if (arrayOfNumberLengths[i] < averageLengthsOfNumbers) {
                System.out.print(newArrayForOptionalTask1_3[i] + "(" + arrayOfNumberLengths[i] + ")");
            }
        }
    }
}

