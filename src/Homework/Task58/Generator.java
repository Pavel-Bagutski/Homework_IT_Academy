package Homework.Task58;

public class Generator extends Thread {


    @Override
    public void run() {
        while (Stoke.countOfNumbers < 10000) {
            if (Stoke.stokeQueue.size() <= 100) {
                int randomNumber = (int) (Math.random() * 100);
                System.out.println(" add number = " + randomNumber + " " + Thread.currentThread().getName());
                Stoke.stokeQueue.add(randomNumber);
            }
        }
    }
}

