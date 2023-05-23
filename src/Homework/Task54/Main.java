package Homework.Task54;
// Создать класс поток, который генерирует массив случайных чисел из 10 элемнтов, затем находим максимадьный элемент,
// в этом массиве, и выводит на экран в формате имя потока, максимальны элемент. Запустить 10 потоков

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ArraysThread arraysThread = new ArraysThread();
            Thread thread =new Thread(arraysThread);
            thread.start();
        }
    }
}
