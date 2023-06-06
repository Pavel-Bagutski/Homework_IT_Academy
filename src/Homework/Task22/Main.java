package Homework.Task22;

import java.util.Arrays;

// Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
// Определите сумму элементов массива, расположенных между минимальным и максимальным значениями. Если значений
// максимальных и минимальных несколько, то необходимо взять максимальное значение разницы индексов между максимальным и
// минимальным значениями.
public class Main {
    public static void main(String[] args) {
        int[] arrNum = new int[10];

        int sum = 0;

        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = (int) (Math.random() * 100);
        }

        System.out.println("Array: " + Arrays.toString(arrNum));

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < arrNum[minIndex]) {
                minIndex = i;
            }
            if (arrNum[i] > arrNum[maxIndex]) {
                maxIndex = i;
            }
        }

        int startIndex = Math.min(minIndex, maxIndex);
        int endIndex = Math.max(minIndex, maxIndex);

        for (int i = startIndex + 1; i < endIndex; i++) {
            sum += arrNum[i];
        }

        System.out.println(" values: " + sum);
    }
}

