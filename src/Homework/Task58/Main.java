package Homework.Task58;
// Есть 3 производителя 2 потребителя, все разные потоки и работают все одновременно. Есть очередь с 200 элементами.
// Производители добавляют случайное число от 1 - 100, а потребители берут эти числа. Если в очереди элементов >= 100
// производители спят, если нет элементов в очереди - потребители спят. Если элементов стало <= 80, производители
// просыпаются. Все это работает до тех пор, пока обработанных элементов не станет 10000, только потом программа завершается.

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Thread generaters[] = new Thread[3];
        Thread consumers[] = new Thread[2];

        for (int i = 0; i < 200 ; i++) {
            Stoke.stokeQueue.add((int)(Math.random()* 100));

        }

        ExecutorService executorServiceGenerate = Executors.newFixedThreadPool(3);

        for (int i = 0; i < generaters.length; i++) {
            generaters[i] = new Thread(new Generator());
            executorServiceGenerate.submit(generaters[i]);
        }

        ExecutorService executorServiceConsumer = Executors.newFixedThreadPool(2);

        for (int i = 0; i < consumers.length; i++) {
            consumers[i] = new Thread(new Consumer());
            executorServiceConsumer.submit(consumers[i]);
        }

        for (Thread generater : generaters) {
            generater.interrupt(); // останавливаем производителей
        }

        for (Thread consumer : consumers) {
            consumer.interrupt(); // останавливаем потребителей
        }
    }
}

