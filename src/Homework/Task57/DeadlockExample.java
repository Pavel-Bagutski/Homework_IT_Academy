
package Homework.Task57;

public class DeadlockExample {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();
    public static Object lock3 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                synchronized(lock1) {
                    System.out.println("Thread 1: Holding lock 1...");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {}
                    System.out.println("Thread 1: Waiting for lock 2...");
                    synchronized(lock2) {
                        System.out.println("Thread 1: Holding lock 1 and lock 2...");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {}
                        System.out.println("Thread 1: Waiting for lock 3...");
                        synchronized(lock3) {
                            System.out.println("Thread 1: Holding lock 1, lock 2, and lock 3...");
                        }
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                synchronized(lock2) {
                    System.out.println("Thread 2: Holding lock 2...");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {}
                    System.out.println("Thread 2: Waiting for lock 3...");
                    synchronized(lock3) {
                        System.out.println("Thread 2: Holding lock 2 and lock 3...");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {}
                        System.out.println("Thread 2: Waiting for lock 1...");
                        synchronized(lock1) {
                            System.out.println("Thread 2: Holding lock 1, lock 2, and lock 3...");
                        }
                    }
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                synchronized(lock3) {
                    System.out.println("Thread 3: Holding lock 3...");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {}
                    System.out.println("Thread 3: Waiting for lock 1...");
                    synchronized(lock1) {
                        System.out.println("Thread 3: Holding lock 1 and lock 3...");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {}
                        System.out.println("Thread 3: Waiting for lock 2...");
                        synchronized(lock2) {
                            System.out.println("Thread 3: Holding lock 1, lock 2, and lock 3...");
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
