package Homework.Task52;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//Создать обьект Person с полями name, surname, age. Сгенерировать 10 обьектов класса Person со случайными полями соответствующего типа.
//С помощью Java создать файл, в который запишется информация о этих людях.
public class Main {
    public static void main(String[] args) throws IOException {

        Random random = new Random(System.currentTimeMillis());

        List<String> names = new ArrayList<>(Arrays.asList("Даниил", "Максим", "Владислав", "Никита", "Артем", "Иван", "Кирилл", "Егор", "Илья", "Андрей"));
        List<String> surnames = new ArrayList<>(Arrays.asList("Соболь", "Владимиров", "Лехнович", "Вранкович", "Васель", "Сернутий", "Врац", "Мухин", "Артерский", "Прокопенко"));

        FileWriter fileWriter = new FileWriter("C:/Users/HP/IdeaProjects/Homework IT Academy/src/Homework/Task52/Persons.txt",false);

        for (int i = 0; i < 10; i++) {
            int age = random.nextInt(65) + 10;
            String name = getAndRemove(names, random.nextInt(names.size()));
            String surname = getAndRemove(surnames, random.nextInt(surnames.size()));
            Person person = new Person(name, surname, age);

            fileWriter.write(String.valueOf(i + 1 + "  "));
            fileWriter.write(person.toString());
            fileWriter.append('\n');
            fileWriter.flush();
        }
        fileWriter.close();

    }
    private static String getAndRemove(List<String> list, int index) {
        String str = list.get(index);
        list.remove(index);
        return str;
    }
}
