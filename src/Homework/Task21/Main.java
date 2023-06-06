package Homework.Task21;
// Создайте переменную для массива из 10 элеметов. Заполните его произвольными значениями цедочисленного типа.
//Найдите максимальный элемент и выведите его индекс

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrNum = new int[10];
        for (int i = 0; i < 10; i++) {
            arrNum[i] = random.nextInt(100) + 1;
            System.out.print(arrNum[i] + " ");
        }
        int maxNum = 0;
        for (int x: arrNum) {
            if (maxNum < x) {
                maxNum = x;
            }
        }
        System.out.println("\n" + maxNum );
    }
}
