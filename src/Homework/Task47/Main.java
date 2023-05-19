package Homework.Task47;
// Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отедльно.

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File directory = new File("C:/Users/HP/IdeaProjects/Homework IT Academy/src/Homework");
        File[] files = directory.listFiles();

        System.out.println("Files:");
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }

        System.out.println("Directories:");
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
    }
}
