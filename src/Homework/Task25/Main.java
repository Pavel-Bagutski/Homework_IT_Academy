package Homework.Task25;
// Создать класс описывающий промежуток времени. Сам промежуток в классе
//должен задаваться тремя свойствами: секундами, минутами, часами. Сделать
//методы для получения полного количества секунд в объекте, сравнения двух
//объектов (метод должен работать аналогично сотрагеТо в строках). Создать два
//конструктора
//
// - получающий общее количество секунд
// - получающий часы, минуты и секунды по отдельности.
//  Сделать метод для вывода данных. Прочее на ваше усмотрение.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Gap gapSecond = new Gap();
        Gap gapThirth = new Gap(4, 75, 650);
        gapThirth = new Gap(19550);


        gapSecond.setHour(26);
        gapSecond.setMinute(21);
        gapSecond.setSecond(40);
        gapSecond.gapAllSeconds(gapSecond.getHour(), gapSecond.getMinute(), gapSecond.getSecond());

        gapSecond.gapHourMinuteSeconde(94900);
    }
}


