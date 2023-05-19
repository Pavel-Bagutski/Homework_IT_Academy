package Homework.Task12;
//Написать метод, который выводит расписание на неделю. Задать на вход в метод порядковый номер дня недели и
//  отобразить на экране то, что запланировано на этот день.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели");
        String dayOfWeek;
        switch (scanner.nextInt()) {
                case 1:
                    dayOfWeek = "Понедельник: Учить java core";
                    break;
                case 2:
                    dayOfWeek = "Вторник: Learn English";
                    break;
                case 3:
                    dayOfWeek = "Среда: Решение задач";
                    break;
                case 4:
                    dayOfWeek = "Четверг: Изучение алгоритмов Лафоре";
                    break;
                case 5:
                    dayOfWeek = "Пятница: Решение задач";
                    break;
                case 6:
                    dayOfWeek = "Суббота: рыбалка на реке";
                    break;
                case 7:
                    dayOfWeek = "Воскресенье: отдых в бане";
                    break;
                default:
                    dayOfWeek = "Некорректный номер дня недели.";
                    break;
        }
        System.out.println(dayOfWeek);
    }
}