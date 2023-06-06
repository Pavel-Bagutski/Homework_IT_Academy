package Homework.Task58;

public class Consumer extends Thread {
    int testCount = 0;

    @Override
    public void run() {
        synchronized (this) {
            while (Stoke.countOfNumbers < 10_000) {
                if (Stoke.stokeQueue.size() == 0)
                    try {
                        Thread.currentThread().wait();
                        if (Stoke.stokeQueue.size() == 0) {
                            Thread.currentThread().notifyAll();
                            break;
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
        if (Stoke.stokeQueue.size() >= 0) {
            Stoke.stokeQueue.remove();
            Stoke.countOfNumbers = Stoke.countOfNumbers + 1;
            System.out.println("delete number from Queue");
            testCount++;
        }
        System.out.println("counter = " + testCount);
    }
}

