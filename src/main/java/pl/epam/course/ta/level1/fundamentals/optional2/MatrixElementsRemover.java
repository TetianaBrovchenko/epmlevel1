package pl.epam.course.ta.level1.fundamentals.optional2;

import java.util.Scanner;

public class MatrixElementsRemover {
    //    4.     Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matrixSize = askMatrixSize(in);
        int matrixHight = askMatrixHight(in);

        int[][] matrixRandomElements = RandomMatrixAssistant.prepareMatrix(matrixSize, matrixHight);

        int maxElementsMatrix = findMaxElementMatrix(matrixSize, matrixRandomElements);

        deleteLinesColumnsAndPrintResult(matrixSize, matrixRandomElements, maxElementsMatrix);
    }

    private static int askMatrixSize(Scanner in) {
        System.out.println("Введите размер матрицы");
        return in.nextInt();
    }

    private static int askMatrixHight(Scanner in) {
        System.out.println("Введите верхее значение чисел матрицы");
        return in.nextInt();
    }

    private static int findMaxElementMatrix(int matrixSize, int[][] matrixRandomElements) {
        Integer maxElement = null;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (maxElement == null || matrixRandomElements[i][j] > maxElement) {
                    maxElement = matrixRandomElements[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент матрицы: " + maxElement);
        return maxElement;
    }

    private static void deleteLinesColumnsAndPrintResult(int matrixSize, int[][] matrixRandomElements, int maxElement) {
        boolean[] lineNumbersToRemove = new boolean[matrixSize];
        boolean[] columnNumbersToRemove = new boolean[matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (matrixRandomElements[i][j] == maxElement) {
                    lineNumbersToRemove[i] = true;
                    columnNumbersToRemove[j] = true;
                }
            }
        }

        int newMatrixSizeLines = 0;
        int newMatrixSizeColumns = 0;

        for (int i = 0; i < matrixSize; i++) {
            if (lineNumbersToRemove[i]) newMatrixSizeLines++;
        }

        for (int i = 0; i < matrixSize; i++) {
            if (columnNumbersToRemove[i]) newMatrixSizeColumns++;
        }

        int[][] newMatrixRandomElements = new int[matrixSize - newMatrixSizeLines][matrixSize - newMatrixSizeColumns];

        System.out.println();
        System.out.println("Матрица не содержащая строк и столбцов с максимальным элементом: ");
        int linesSkiped = 0;
        int columnsSkiped = 0;

        for (int i = 0; i < matrixSize; i++) {
            columnsSkiped = 0;
            if (!lineNumbersToRemove[i]) {
                for (int j = 0; j < matrixSize; j++) {
                    if (!columnNumbersToRemove[j]) {
                        newMatrixRandomElements[i - linesSkiped][j - columnsSkiped] = matrixRandomElements[i][j];
                        System.out.print(newMatrixRandomElements[i - linesSkiped][j - columnsSkiped] + "\t");
                    } else {
                        columnsSkiped++;
                    }

                }
                System.out.println();
            } else {
                linesSkiped++;

            }
        }

    }
}


