package pl.epam.course.ta.level1.fundamentals.optional2;

import java.util.Random;

public class RandomMatrixAssistant {
    //Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M
    // до M с помощью генератора случайных чисел (класс Random).

    public static int[][] prepareMatrix(int matrixSize, int matrixHight) {
        int[][] matrixRandomElements = new int[matrixSize][matrixSize];

        Random randomIndex = new Random();
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrixRandomElements[i][j] = randomIndex.nextInt(matrixHight + matrixHight) - (matrixHight - 1);
                System.out.print(matrixRandomElements[i][j] + "\t");
            }
            System.out.println();
        }

        return matrixRandomElements;
    }
}
