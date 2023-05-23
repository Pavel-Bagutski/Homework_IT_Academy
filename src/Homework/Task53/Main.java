package Homework.Task53;
//Создать 10 потоков, каждый из которых вычисляет среднее арифметическое коллекции из 10 случайных целых чисел и
// выводит на экран.


public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            new MainThread().start();
        }
    }
}
