package Homework.Task58;
//Есть 3 производителя и 2 потребителя, все разные потоки и работают все одновременно. Есть очередь с 200 элементами.
// Производители добавляют случайное число от 1..100. а потребители берут эти числа. Если в очереди элементов >= 100
// производители спят,-если нет элементов в очереди — потребители спят. Если элементов стало <= 80, производители
// просыпаются. Все это работает до тех пор, пока обработанных элементов не станет 10000, только потом программа
// завершается.

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
        threadGenerate1.start();
        threadConsumer1.start();
        threadGenerate1.start();




    }
}

