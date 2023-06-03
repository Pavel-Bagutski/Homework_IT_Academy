/*
package
// Создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых чисел -> засыпает произвольно на 1-10
// секунд, результат выполнения - сумму этих чисел в виде строки. Запустить 10 задач параллельно в пуле 3 потоков.
// Вывести ход программы на экран с указанием имени потока, который выполняет работу.
        Homework.Task60;
import Homework.Task59.FileGenerator;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Mian {
        public static void main(String[] args) throws Exception {
            ExecutorService executor = Executors.newFixedThreadPool(3);
            List<Callable<List<String>>> tasks = List.of(
                    new RandomNumber(),
                    new RandomNumber(),
                    new RandomNumber(),
                    new RandomNumber(),
                    new RandomNumber(),
                    new RandomNumber(),
                    new RandomNumber(),
                    new RandomNumber(),
                    new RandomNumber(),
                    new RandomNumber()
            );
            List <Future<List<String>>> futures = executor.invokeAll(tasks);
            for (int i = 0; i < futures.size(); i++) {
                Future<List<String>> future = futures.get(i);
                List<String> words = future.get();
                int summ = 0;
                for (String s:
                     words) {
                    summ = summ + Integer.valueOf(s);
                }
                System.out.println(words + "summa is = " + summ);
            }
            executor.shutdown();
        }

    }*/
