package Homework.Task27;
// Введите склавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее
// количество знаков.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "Здравствуйте, призраки завтра, Это я вам пою....., Здравствуйте, призраки завтрау.";

        Pattern pat = Pattern.compile("[,.!?:;-]");
        Matcher match = pat.matcher(str);
        int count = 0;
        while (match.find()) {
            count++;
        }
        System.out.println(count);
    }
}