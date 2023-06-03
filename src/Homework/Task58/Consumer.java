package Homework.Task58;

public class Consumer extends Thread {
    int testCount = 0;

    @Override
    public void run() {
        while (Stoke.countOfNumbers < 10_000) {
            if (Stoke.stokeQueue.size() >= 0) {
                Stoke.stokeQueue.remove();
                Stoke.countOfNumbers = Stoke.countOfNumbers + 1;
                System.out.println("delete");
                testCount++;
            }
        }
        System.out.println("counter = " + testCount);
    }
}

