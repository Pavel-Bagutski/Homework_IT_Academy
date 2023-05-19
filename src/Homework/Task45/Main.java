package Homework.Task45;
//Написать собственное исключение от Exception. Сгенерировать код который будет выбрасывать его и обрабатывать.
// Резултат работы программы вывести на экран.

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
