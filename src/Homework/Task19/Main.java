package Homework.Task19;
// Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа и
// выведите последний элемент массива на экран.

public class Main {
    public static void main(String[] args) {
        int[] arrNum = new int[10];
        for (int i = 0; i < 10; i++) {
            arrNum[i] = (int) (Math.random() * 44);
        }
        System.out.println(" end number of array is " + arrNum [9]);
    }
}
