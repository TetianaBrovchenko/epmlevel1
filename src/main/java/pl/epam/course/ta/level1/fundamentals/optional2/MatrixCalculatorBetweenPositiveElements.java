package pl.epam.course.ta.level1.fundamentals.optional2;

import java.util.Scanner;

public class MatrixCalculatorBetweenPositiveElements {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matrixSize = askMatrixSize(in);
        int matrixHight = askMatrixHight(in);

        int[][] matrixRandomElements = RandomMatrixAssistant.prepareMatrix(matrixSize, matrixHight);

        int[] sumBetweenFirstAndSecondElementsInLine =
                calculateSumBetweenPositivesPerLines(matrixSize, matrixRandomElements);

        printResults(sumBetweenFirstAndSecondElementsInLine);
    }

    private static int askMatrixSize(Scanner in) {
        System.out.println("Введите размер матрицы");
        return in.nextInt();
    }

    private static int askMatrixHight(Scanner in) {
        System.out.println("Введите верхее значение чисел матрицы");
        return in.nextInt();
    }

    private static int[] calculateSumBetweenPositivesPerLines(int matrixSize, int[][] matrixRandomElements) {
        // 3.Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
        int[] result = new int[matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            boolean shouldСount = false;
            int sum = 0;
            for (int j = 0; j < matrixSize; j++) {
                if (matrixRandomElements[i][j] > 0) {
                    if (!shouldСount) {
                        shouldСount = true;
                    } else {
                        break;
                    }
                } else {
                    boolean isEndOfLine = j == matrixSize - 1;
                    if (isEndOfLine) {
                        sum = 0;
                    } else if (shouldСount) {
                        sum += matrixRandomElements[i][j];
                    }
                }
            }
            result[i] = sum;
        }
        return result;
    }

    private static void printResults(int[] sumBetweenFirstAndSecondElementsInLine) {
        for (int i = 0; i < sumBetweenFirstAndSecondElementsInLine.length; i++) {
            System.out.println("Сумма между первыми положительными элементами строки " + i + " = " +
                    sumBetweenFirstAndSecondElementsInLine[i]);
        }
    }
}






