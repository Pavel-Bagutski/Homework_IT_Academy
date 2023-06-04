package Homework.Task61;
// Создать задачу Callable, которая берет сообщенте "Hello World" + текущее время и записывает его в файл.
// Запись в файл должна производиться последовательно через синхронизированный метод. Запусить 10 задач параллельно
// в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executors.submit(new TaskCallableHelloWorld());
        }
        executors.shutdown();
    }
}
