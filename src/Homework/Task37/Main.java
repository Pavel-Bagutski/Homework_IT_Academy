package Homework.Task37;
//Написать метод, который выводит следующий сезон от заданного во входном параметре. Входной параметр ввести с клавиатуры


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" enter the season of the year WINTER\n" +
                "or SPRING\n" +
                "or SUMMER\n" +
                "or AUTUMN");

        Scanner scanner = new Scanner(System.in);
        Season enterSeason = Season.valueOf(scanner.nextLine().toUpperCase());
        Season plusOneSeason = Season.getNextSeason(enterSeason);
        System.out.println( "new season is -- " + plusOneSeason);
    }
}
