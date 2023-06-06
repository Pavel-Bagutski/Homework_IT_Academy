package Homework.Task32;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        String str = "aaabbbbcccc";
        String strAll = "";

        int count = 0;

        LocalTime start = LocalTime.now();
        while (count < 100_000) {
            strAll = strAll + str;
            count++;
        }
        LocalTime finish = LocalTime.now();
        double res = finish.toSecondOfDay() - start.toSecondOfDay();
        System.out.println("result of String with increment operation is : " + res);

        StringBuilder strB = new StringBuilder("aaabbbbcccc");
        StringBuilder StrC = new StringBuilder("");
        count = 0;
        start = LocalTime.now();
        while (count < 100_000) {
            StrC.append(strB);
            count++;
        }
        finish = LocalTime.now();
        res = finish.toSecondOfDay() - start.toSecondOfDay();
        System.out.println("result of StringBuffer with append method is : "  + res);
    }

}
