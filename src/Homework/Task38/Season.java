package Homework.Task38;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Locale;

public enum Season {
    WINTER ,
    SPRING ,
    SUMMER ,
    AUTUMN ;

    public static void printQuantityDays (Season season){
        switch (season){
            case WINTER -> System.out.println("90 days");
            case SPRING -> System.out.println("92 days");
            case SUMMER -> System.out.println("92 days");
            case AUTUMN -> System.out.println("91 days");
        }
    }
}
