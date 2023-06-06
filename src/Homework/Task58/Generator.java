package Homework.Task58;

public class Generator extends Thread {

    int counter = 0;

    @Override
    public void run() {
        synchronized (this) {
            while (Stoke.countOfNumbers < 10000) {
                if (Stoke.stokeQueue.size() > 100) {
                    try {
                        Thread.currentThread().wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {
                    int randomNumber = (int) (Math.random() * 100);
                    Stoke.stokeQueue.add(randomNumber);
                    System.out.println(" add number = " + randomNumber + " " + Thread.currentThread().getName());
                    counter++;
                }
            }
        }
        System.out.println(counter + " it's creators operation");
    }
}

