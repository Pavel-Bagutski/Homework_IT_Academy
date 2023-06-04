package Homework.Task64;
// Сгенерируйте List коллекцию целых чисел из n элементов от minValue до maxValue. Определитн содержатся ли в данной
// коллекции числа которые делятся на 3 и на 5 помощью stream.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int minValue = 2;
        int maxValue = 120;

        List<Integer> list = new ArrayList<>();
        for (int i = minValue; i < maxValue; i++) {
            list.add(i);
        }
        list.stream()
                .filter(e -> e % 3 == 0 && e % 5 == 0)
                .forEach(integer -> System.out.println("Number is divided on 5 and 3 is =" + integer));
    }
}
