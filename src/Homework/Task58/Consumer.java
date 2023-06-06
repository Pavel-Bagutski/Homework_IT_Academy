package Homework.Task58;

public class Consumer implements Runnable {

    @Override
    public void run() {
        while (Stoke.countIteration <= 10_000) {
            Stoke.stoke.takeGood();
        }
    }
}

