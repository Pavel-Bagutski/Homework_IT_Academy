package Homework.Task6;
// Задать промежуток времени в секундах в виде переменной. Следует вывести его на экран в в иде часов, минут и секунд,
// суток и недель.

public class Main {
    public static void main(String[] args) {
        int seconds = 10_000_000;

        int minutes = seconds / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        int weeks = days / 7;

        int remainingSeconds = seconds % 60;
        int remainingMinutes = minutes % 60;
        int remainingHours = hours % 24;
        int remainingDays = days % 7;

        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + remainingDays);
        System.out.println("Hours: " + remainingHours);
        System.out.println("Minutes: " + remainingMinutes);
        System.out.println("Seconds: " + remainingSeconds);
    }
}
