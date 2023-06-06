package Homework.Task28;
//Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что.
//слова могут разделяться несколькими пробелами, в начале и конце текста также
//могут быть пробелы, но могут и отсутствовать.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String input = scanner.nextLine().trim();

        int count = 0;
        if (!input.isEmpty()) {
            count = input.split("\\s+").length;
        }

        System.out.println("Количество слов в тексте: " + count);
    }
}
