package Homework.Task58;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Stoke stoke = new Stoke();

        Thread threadGenerate1 = new Thread(new Generator());
        Thread threadGenerate2 = new Thread(new Generator());
        Thread threadGenerate3 = new Thread(new Generator());

        Thread threadConsumer1 = new Thread(new Consumer());
        Thread threadConsumer2 = new Thread(new Consumer());

        threadGenerate1.start();
        threadConsumer1.start();
        threadGenerate2.start();
        threadConsumer2.start();
        threadGenerate3.start();

    }
}

