package Homework.Task36;
//Создать enum который описывает поры года. Добавить поле description в этот enum. Вывести на экран все константы поры года.

import Homework.Task37.Season;

public class Main {
    public static void main(String[] args) {

        Seasons.WINTER.setCountOfDays(90);
        Seasons.SPRING.setCountOfDays(92);
        Seasons.SUMMER.setCountOfDays(92);
        Seasons.AUTUMN.setCountOfDays(91);


        for (Seasons seasons : Seasons.values()){
            System.out.println(seasons + " " + seasons.getDescription() + " " +  seasons.getCountOfDays());
        }
    }
}
