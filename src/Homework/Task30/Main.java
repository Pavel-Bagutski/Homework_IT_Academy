package Homework.Task30;
// Введите с клавиатуры строку. Напишите метод, выполняющий поисе в строке шестнадцатеричных чисел, записанных по правилам
// Java, с помощью регулярных выражений. Резултат рабоыт метода вывести на экран.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "0x7FFF";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b0[xX][0-9a-fA-F]+\\b");
        Matcher matcher = pattern.matcher(input);

        System.out.print("fond number sixth's: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
