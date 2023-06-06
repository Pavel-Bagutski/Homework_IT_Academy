package Homework.Task58;

public class Generator implements Runnable {

    @Override
    public void run() {
        while (true) {
            Stoke.stoke.addNumber();
            if (Stoke.countIteration > 10_000) {
                break;
            }
        }
    }
}
