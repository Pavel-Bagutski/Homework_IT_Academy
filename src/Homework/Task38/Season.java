package Homework.Task38;

import java.time.LocalDate;
import java.util.Locale;
import java.time.LocalDate;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    public static void printQuantityDays(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("90 days");
                break;
            case SPRING:
                System.out.println("92 days");
                break;
            case SUMMER:
                System.out.println("92 days");
                break;
            case AUTUMN:
                System.out.println("91 days");
                break;
        }
    }
}
