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
        for (int j : newArrayForOptionalTask1) {
            if (resultShortestNumber > j) {
                resultShortestNumber = j;
            }
        }
        return resultShortestNumber;

    }

    private static int getLongestNumber(int[] newArrayForOptionalTask1) {
        int resultLongestNumber = newArrayForOptionalTask1[0];
        for (int j : newArrayForOptionalTask1) {
            if (j > resultLongestNumber) {
                resultLongestNumber = j;
            }
        }
        return resultLongestNumber;
    }

    private static int getNumberLength(int lengthNumber) {
        return String.valueOf(Math.abs(lengthNumber)).length();
    }

}
