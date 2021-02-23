package pl.epam.course.ta.level1.fundamentals.main;

public class SumProductNumbers {
    public static void main(String[] commandLineArguments) {
        //4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

        int sum = 0;
        int comb = 1;
        System.out.println("Аргументы командной строки: ");

        for (int i = 0; i < commandLineArguments.length; i++) {
            int stringArgument = Integer.parseInt(commandLineArguments[i]);
            System.out.print(" "+stringArgument);
            sum +=stringArgument;
            comb *=stringArgument;
        }
        System.out.println();
        System.out.println("Cумма введённых чисел: " + sum);
        System.out.println("Произведение введённых чисел: " + comb);

    }
}
