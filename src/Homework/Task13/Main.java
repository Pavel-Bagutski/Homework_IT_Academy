package Homework.Task13;
//Вычислить факториал целых чисел от 0 до 10 с помощью цикла while.

public class Main {
    public static void main(String[] args) {
        int factorial = 0;
        int n = 0;
        while (n <= 10){
            factorial = 1;
            int i = 1;
            while (i <=n){
                factorial *= i;
                i++;
            }
            System.out.println(n + "! = " + factorial);
            n++;
        }
    }
}
