package Homework.Task43;
//Ввести текст с клавиатуры. Для текста создать Мар, где ключом будет слово, а значение - количество повторений
// этого слова в тексте.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Это пример строки, содержащей содержащей содержащей несколько содержащей слов.";
        String[] words = (text.split("[^а-яА-Я]+"));

        Map<String, Integer> wordsReapet = new TreeMap<>();

        for (String word : words) {
            if (wordsReapet.containsKey(word)) {
                int count = wordsReapet.get(word);
                wordsReapet.put(word, count + 1);
            } else {
                wordsReapet.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordsReapet.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
    }
}