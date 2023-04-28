package Homework.Task41;
//Создать коллекцию заполнить ее случайными целыми числами. Удалить повторяющиеся.

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.HashSet.newHashSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 44 ; i++) {
            int numberRandom = (int)(Math.random() * 10);
            numbers.add(numberRandom);
        }
        System.out.println(numbers);

        Set<Integer> numbersWithoutDuplicates = new HashSet<>();

        numbersWithoutDuplicates = Set.copyOf(numbers);
        System.out.println(numbersWithoutDuplicates);
    }
}
