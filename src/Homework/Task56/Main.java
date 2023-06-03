package Homework.Task56;
// Создать метод, который печатает название потока и засыпает на 2 секунды. Запустить одновременно 10 потоков.
// Реализовать механизм синзронизации, чтобы все потоки выполнялись последовательно.


public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
        }
    }
}
