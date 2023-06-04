package Homework.Task63;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Person {

    int age;
    String name;
    String surname;

    List<String> nameList = new ArrayList<>(Arrays.asList("Иван", "Виталий", "Павел", "Илья", "Олег", "Петр", "Кирилл", "Вадим",
            "Артем", "Генадий", "Конастантин", "Денис", "Дмитрий", "Антон", "Серей", "Александр", "Артур", "Григорий", "Максим"));
    List<String> surnameList = new ArrayList<>(Arrays.asList("Кравченко", "Соловьёв", "Архипов", "Макаров", "Алчевский",
            "Захаров", "Жданов", "Дмитриев", "Ковалёв", "Куликов", "Власов", "Гамула", "Захаров", "Овчинников", "Барановский", "Исаев",
            "Лобанов", "Василенко", "Бердник", "Самсонов", "Петров", "Бобылёв", "Андрейко", "Гайчук", "Капустин"));

    public List<Person> generatePerson() {
        Random random = new Random();
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            int years = random.nextInt(15) + 15;
            person.setAge(years);
            person.setSurname(choiceRandom(surnameList, random.nextInt(surnameList.size())));
            person.setName(choiceRandom(nameList, random.nextInt(nameList.size())));
            persons.add(person);


        }
        return persons;
    }

    public static String choiceRandom(List<String> list, int index) {
        return list.get(index);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
