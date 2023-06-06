package Homework.Task58;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Stoke {

    static final Stoke stoke = new Stoke();

    public static Queue<Integer> stokeQueue = new LinkedList<>();

    static int countIteration = 0;


    public void addNumber() {
        if (stokeQueue.size() < 100 || stokeQueue.size() > 80) {
            int addNum = ((int) (Math.random() * 100));
            this.stokeQueue.add(addNum);
            System.out.println(Thread.currentThread().getName() + " adds " + addNum + " stoke size is " + stokeQueue.size());
        }
    }

    public void takeGood() {
        if (stokeQueue.size() >= 0) {
            int rem = stokeQueue.remove();
            System.out.println(Thread.currentThread().getName() + " remove " + rem + " stoke size is " + stokeQueue.size());
            Stoke.countIteration++;
        }
    }
}
