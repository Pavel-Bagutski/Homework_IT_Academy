package Homework.Task54;

import java.util.Random;

public class ArraysThread implements Runnable {
    Random random = new Random();

    @Override
    public void run() {
        int[] arr = new int[10];
        int max = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10);
            if (max < arr[i]) max = arr[i];
        }
        System.out.println(Thread.currentThread().getName() + "- max number of array = " + max);


    }
}