package Homework.Task52;

public class Person {

    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "" + name + " " +  surname  +
                "," + age +" лет" +
                '}';
    }
}
