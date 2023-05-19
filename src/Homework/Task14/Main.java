package Homework.Task14;
//Вычислить произведение чисел от 1 до 25 с помощью цикла while.

public class Main {
    public static void main(String[] args) {
        long n = 1;
        long summa = 1;
        while (n <= 25){
            summa *= n;
            n++;
        }
        System.out.println(summa);
    }
}
