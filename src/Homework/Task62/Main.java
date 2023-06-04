package Homework.Task62;
// Напишите программу, которая для все четных значений длиной от 1 до 20 дюймов: печатает на экран значения в дюймах
// переводит значения в сантиметры
// печатает на экран сумму в сантиметрах

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static double sumInch(List<Integer> list) {
        return list.stream().
                filter(Objects::nonNull).
                filter((i) -> i % 2 == 0).
                peek((s) -> System.out.println(s + " -- in inch")).
                mapToDouble((x) -> x.doubleValue() * 2.54).
                sum();

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            list.add(i);
        }
        System.out.println(Main.sumInch(list));
    }
}
