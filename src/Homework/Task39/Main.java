package Homework.Task39;
//Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle. Создать поле name в классе и
// проинициализировать его через конструктора. Создать generic класс Garage , который может хранить только обьекты типа
// наследуемого от Vehicle. Создать 2 обтекта класса Garage (все поля ввсести с клавиатуры) и вывести на экран имя транспортного средства.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter car name");
        Garage garage1 = new Garage<>(new Car(scanner.nextLine()));
        System.out.println(garage1);

        System.out.println("ener motorcycle name");
        Garage garage2 = new Garage<>(new Motorcycle(scanner.nextLine()));
        System.out.println(garage2);



    }
}
