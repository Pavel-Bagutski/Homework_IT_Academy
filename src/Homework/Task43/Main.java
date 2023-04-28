package Homework.Task43;
//Ввести текст с клавиатуры. Для текста создать Мар, где ключом будет слово, а значение - количество повторений
// этого слова в тексте.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] words = (text.split("[^а-яА-Яa-zA-Z]+"));

        Map<String, Integer> wordsRepeat = new TreeMap<>();

        for (String word : words) {
            if (wordsRepeat.containsKey(word)) {
                int count = wordsRepeat.get(word);
                wordsRepeat.put(word, count + 1);
            } else {
                wordsRepeat.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordsRepeat.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
        scanner.close();
    }
}