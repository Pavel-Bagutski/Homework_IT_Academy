package Homework.Task60;
// Создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых чисел -> засыпает произвольно на 1-10
// секунд, результат выполнения - сумму этих чисел в виде строки. Запустить 10 задач параллельно в пуле 3 потоков.
// Вывести ход программы на экран с указанием имени потока, который выполняет работу.

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Mian {
        public static void main(String[] args) throws Exception {
            ExecutorService executor = Executors.newFixedThreadPool(3);
            for (int i = 0; i < 10; i++) {
               executor.submit(new RandomNumber());
            }
            executor.shutdown();
        }

    }
