package Homework.Task55;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class ThreadWriter implements Runnable {
    @Override
    public void run() {
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(10);
        }
        try {
            FileOutputStream file = new FileOutputStream("src/Homework/Task55/RandomArrays.txt", true);
            OutputStreamWriter streamWriter = new OutputStreamWriter(file);
            int count = 0;
            streamWriter.append(Thread.currentThread().getName() + " -- arrays arr have next number");
            for (Integer i :
                    arr) {
                streamWriter.append(String.valueOf(i));
                streamWriter.append(" ");
                count++;
                if (count == 10) {
                    streamWriter.append("\n");
                }
            }
            streamWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
