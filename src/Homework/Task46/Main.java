package Homework.Task46;
//Написать метод, который будет возбуждать исключение и обрабатывать это исключение на уровне выше.
// Результат работы программы вывести на экран.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void methodException (String str){
        List <Integer> listOfNumbers = new ArrayList<>();
        int n = 32767;
        try {
            listOfNumbers.add(Integer.valueOf(str));
        } catch (IllegalArgumentException e) { //NumberFormatException extends IllegalArgumentException
            System.out.println(e.getMessage() + " invalid value");
        }
    }
    public static void main(String[] args) {
        Main.methodException("number one");
    }
}
