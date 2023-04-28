package Homework.Task40;
// Создать список оценок учеников с помощью ArrayList, заполинть случайными оценками. Удалить неудовлетворительные

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> gradeOfStudent = new ArrayList<>(25);
        for (int i = 0; i < 20; i++) {
            gradeOfStudent.add((int)(Math.random() * 10));
        }
        int number;
        Iterator <Integer> iterator = gradeOfStudent.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            number = iterator.next();
            if (number <= 3) {
                iterator.remove();
            }
        }
        System.out.println("satisfactory grades - "  + gradeOfStudent);
    }
}
