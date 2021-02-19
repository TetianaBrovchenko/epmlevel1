package pl.epam.course.ta.level1.fundamentals.optional1;

import static pl.epam.course.ta.level1.fundamentals.optional1.ArrayAssistantFromConsole.createArrayOfNumbers;

public class FindMinMaxNumbers {
    //  1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void main(String[] args) {
        int[] newArrayForOptionalTask1_1 = createArrayOfNumbers();

        int shortestNumber = getShortestNumber(newArrayForOptionalTask1_1);
        int longestNumber = getLongestNumber(newArrayForOptionalTask1_1);

        int lengthShortestNumber = getNumberLength(shortestNumber);
        int lengthLongestNumber = getNumberLength(longestNumber);

        System.out.println("Самое короткое число " + shortestNumber + ", его длина = " + lengthShortestNumber);
        System.out.println("Самое длинное число " + longestNumber + ", его длина = " + lengthLongestNumber);

    }

    private static int getShortestNumber(int[] newArrayForOptionalTask1) {
        int resultShortestNumber = newArrayForOptionalTask1[0];
        for (int i = 0; i < newArrayForOptionalTask1.length; i++) {
            if (resultShortestNumber > newArrayForOptionalTask1[i]) {
                resultShortestNumber = newArrayForOptionalTask1[i];
            }
        }
        return resultShortestNumber;

    }

    private static int getLongestNumber(int[] newArrayForOptionalTask1) {
        int resultLongestNumber = newArrayForOptionalTask1[0];
        for (int i = 0; i < newArrayForOptionalTask1.length; i++) {
            if (newArrayForOptionalTask1[i] > resultLongestNumber) {
                resultLongestNumber = newArrayForOptionalTask1[i];
            }
        }
        return resultLongestNumber;
    }

    private static int getNumberLength(int lengthNumber) {
        return String.valueOf(Math.abs(lengthNumber)).length();
    }

//  2.     Вывести числа в порядке возрастания (убывания) значений их длины.
//  4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
//  5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
//  6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
//  7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.


}
