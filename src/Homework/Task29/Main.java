package Homework.Task29;
// Введите с клавиатуры текст. Выведите на экран текс, составленный из
//последних букв всех слов из исходного текста.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        firstMethod();
    }
    public static void firstMethod() {
        String str = "Вывести текст, составленный из последних букв всех слов asd";
        String regexp = "([а-яА-Я]+)|([a-zA-Z]+)";
        StringBuilder result = new StringBuilder();

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(str);

        int coint = 0;
        while (matcher.find()) {
            result.append(str.substring(matcher.end() - 3, matcher.end()));
            result.append(" ");
            coint++;
        }
        System.out.println(result + "\n count word = " + coint);
    }

}

