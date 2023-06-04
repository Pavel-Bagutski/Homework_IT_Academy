package Homework.Task59;

// Создать задачу Callable, которая генерирует 10 фалов с 10 произвольными строками -> засыпает произвольно
// на 1-3 секунды, результат выполнения коллекция имен файлов. Запустить 10 задач паралельно в пуле из 3 потоков.
// вывести ход программы на экран с указанием имни потока, который выполняет работу.


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<List<String>>> tasks = List.of(
                new FileGenerator(),
                new FileGenerator(),
                new FileGenerator(),
                new FileGenerator(),
                new FileGenerator(),
                new FileGenerator(),
                new FileGenerator(),
                new FileGenerator(),
                new FileGenerator(),
                new FileGenerator()
        );
        List<Future<List<String>>> futures = executor.invokeAll(tasks);
        for (int i = 0; i < futures.size(); i++) {
            Future<List<String>> future = futures.get(i);
            List<String> words = future.get();
            System.out.println("Task " + i + 1 + " generated files: " + words);
        }
        executor.shutdown();
    }
}
