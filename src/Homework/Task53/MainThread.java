package Homework.Task53;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainThread extends Thread {

    @Override
    public void run() {
        int summa = 0;
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1000));
        }
        for (int i = 0; i < list.size(); i++) {
            summa = summa + (int) (list.get(i));
        }
        System.out.println( Thread.currentThread().getName() + " -- " + summa / list.size());
    }
}
