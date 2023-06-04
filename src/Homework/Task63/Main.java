package Homework.Task63;
// Сойздайте класс персон с полями name, surname, age. Сгенерируйте группу из 100 человек в возрасте от 15 до 30.
// Напишите ОДНУ НЕПРЕРЫВНУЮ цепочку steam вызовов, которая:
// 1. выбирает обьекты, возвраст которых меньше 21;
// 2. распечатытает их на экран;
// 3. сортирует по фамилии, а потом по имени (использовать thenComparing у Comparator)
// 4. берет 4 первых обьекта
// 5. формирует коллекцию из фамилий обьектов
// 6. агрегирует все в коллекцию


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        PersonsSort personsSort = new PersonsSort();
        List <Person> personList = person.generatePerson();
        List <String> surnameList =  personsSort.persSorting(personList);
        System.out.println("new collection 4 surname");
        System.out.println(surnameList);

    }
}
