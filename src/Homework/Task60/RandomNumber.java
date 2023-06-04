package Homework.Task60;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumber implements Callable<List<Integer>> {
    Random random = new Random();

    @Override
    public List<Integer> call() throws Exception {
        int summa = 0;
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add((random.nextInt(10)));
        }
        Thread.sleep(random.nextInt(9000) + 1000);

        for (Integer s :
                randomNumbers) {
            summa += s;

        }
        System.out.println(Thread.currentThread().getName() + " = " + randomNumbers.toString() + "- summa of random numbers " + summa);
        return randomNumbers;
    }
}