package Homework.Task63;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonsSort {
    public List<String> persSorting(List<Person> list) {
        return list.stream().
                filter(e -> e.getAge() < 21)
                .peek(e -> System.out.println(e))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());
    }
}
