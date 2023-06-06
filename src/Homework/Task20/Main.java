package Homework.Task20;
// Создайте переменную для массива из 10 элементов (другим способом). Заполните его произвольынми значениями целочисленного
// типа и выведи на экран элементы, состоящие на четных позициях.

public class Main {
    public static void main(String[] args) {
        int[] arrNum = new int[]{1, 2, 3, 45, 6, 7, 89, 6, 5, 41};
        for (int i = 0; i < arrNum.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println(arrNum[i]);
            }
        }
    }
}
