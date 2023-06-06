package Homework.Task23;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

// Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
// Выведите на экран, переверните и снова выведите на экран.(при переворачивани нежелательно создавать еще один массив)
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrNum = new int[10];

        for (int i = 0; i < 10; i++) {
            arrNum[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arrNum));

        int temp = 0;
        int firstIndex = 0;
        for (int i = 9; i >= 0; i--) {
            temp = arrNum[firstIndex];
            arrNum[firstIndex] = arrNum[i];
            arrNum[i] = temp;
        }
        System.out.println("reverse of array arrNum : \n" +
                ""  + Arrays.toString(arrNum));
    }
}
