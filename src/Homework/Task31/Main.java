package Homework.Task31;
// Введите с клавиатуры строку. Напишите метод, выполняющий поискв строке всех тегов абзацев, в том числе тех, у которых
// есть параметры, например, <p id="p1">, и замену их на простые теги абзацев <p>. Результат работы метода вывести
// на экран.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("<p\\s+.*?>");
        Matcher matcher = pattern.matcher(input);

        String output = matcher.replaceAll("<p>");

        System.out.println("Результат замены: " + output);

    }

}
