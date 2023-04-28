package Homework.Task42;
// Создать список оценок учеников с помощью ArrayList, заполинть случайными оценками.
// Найти самую высокую оценку с использованием итератора

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> gradeOfStudent = new ArrayList<>(25);
        for (int i = 0; i < 20; i++) {
            gradeOfStudent.add((int)(Math.random() * 10));
        }
        int numberMax = 0;
        int number;
        Iterator <Integer> iterator = gradeOfStudent.iterator();
        while (iterator.hasNext()) {
            number = iterator.next();

            if ( numberMax < number ) {
                numberMax = number;
            }
        }
        System.out.println(gradeOfStudent);
        System.out.println(numberMax);
    }
}
