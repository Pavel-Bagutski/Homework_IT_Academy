package Homework.Task5;
// Написать метод, который принимает на вход два целых числа, суммирует их, и перемножает результаты суммирует.
//Возвращает полученный резульат. Передать два числа. Вывести на экрна результат.

public class Main {
    public static void main(String[] args) {
        MathMetod mathMetod = new MathMetod();
        System.out.println(mathMetod.mathSolusion(2, 3));
    }
}
class MathMetod {
    public int mathSolusion (int a, int b){
        return (a + b)+ a * b;
    }
}
