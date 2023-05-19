package Homework.Task9;
//Задать целое число в виде переменной, это число - сумма денег в рублях.
//вывести это число на экран, добавив к нему слово "Рублей" в правильном падеже.

public class Main {
    public static void main(String[] args) {
        int byr = 464_784;

        if (byr % 10 == 1) System.out.println(byr + " Рубль");
        else if (byr % 10 == 2 || byr % 10 == 3 || byr % 10 == 4) System.out.println(byr + " Рубля");
        else if (byr % 10 == 5 || byr % 10 == 6 || byr % 10 == 8 || byr % 10 == 9 || byr % 10 == 0) System.out.println(byr + " Рублей");
    }
}
