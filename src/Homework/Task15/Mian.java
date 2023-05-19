package Homework.Task15;
// Посчитать сумму цифр числа 7893823445 с помощью цикла do while.


public class Mian {
    public static void main(String[] args) {

        long number = 7893823445L;

        long sum = 0;
        final long NUMBEROFSUMM = number;

        do {

            sum += number % 10;
            number /= 10;

        } while (number != 0);

        System.out.println("сумма чисел числа " + NUMBEROFSUMM + " составляет = " + sum);
    }
}
