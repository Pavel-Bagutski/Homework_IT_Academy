package Homework.Task57;
//Создать программу которая реализует deadlock между тремя потоками.

public class Main {
    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();
        Main main3 = new Main();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                synchronized (main1) {
                    System.out.println("print Thread 1 main1 ");
                    synchronized (main2) {
                        System.out.println("print Thread 1 main2 ");
                        synchronized (main3) {
                            System.out.println("print Thread main3 ");
                        }
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                synchronized (main2) {
                    System.out.println("print Thread 2 main2");
                    synchronized (main3) {
                        System.out.println("print Thread 2 main3 ");
                        synchronized (main1) {
                            System.out.println("print Thread 2 main1 ");
                        }
                    }
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                synchronized (main3) {
                    System.out.println("print Thread 3 main3");
                    synchronized (main1) {
                        System.out.println("print Thread 3 main1");
                        synchronized (main2) {
                            System.out.println("print Thread 3  main2");
                        }
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
