package Homework.Task55;
//Создать класс поток, который создает средствами Java файл и записать в него произвольно сгенерированные массив из
// 10 случайных чисел. Запусить 5 потоков.

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ThreadWriter writer = new ThreadWriter();
            Thread thread = new Thread(writer);
            thread.start();
        }
    }
}
