package Homework.Task17;
// Для челых чисел которые делятся на 7 в диапозоне от 1 до 100, вывести на экран строку "Hope!".

public class Main {
    public static void main(String[] args) {

        int n = 1;
        while (n <= 100) {
            if (n % 7 == 0) {
                System.out.println( n + " Hope!");
            }
            n++;
        }
    }

}
