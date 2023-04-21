package Homework.Task38;
//Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
// Входной параметр ввести с клавиатуры

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the season for know quantity a days");
        Season.printQuantityDays(Season.valueOf(scanner.nextLine().toUpperCase()));


    }
}
