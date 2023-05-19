package Homework.Task51;
// Создать цепочку из трех папок.В конечном каталоге создать 5 произвольных текствовых файлов. Заполтнить их 10 произвольными числами.
// Содержимое файлов записать в один файл в том же каталоге. Создать файл, который будет содержать список файлов данного каталога.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        File directory = new File("C:/Users/HP/IdeaProjects/Homework IT Academy/src/Homework/Task51/catalogOne");
        directory.mkdirs();

        int x = 1;

        for (int i = 0; i < 5; i++) {
            String str = "text" + x + ".txt";
            x++;
            System.out.println(str);
            try {
                FileWriter writer = new FileWriter("C:/Users/HP/IdeaProjects/Homework IT Academy/src/Homework/Task51/catalogOne/" + str, false);
                for (int j = 0; j <= 10; j++) {
                    writer.write(String.valueOf((int) (Math.random()* 100)));
                    writer.append('\n');
                }
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
            int t = 1;
            String str = "text" + t + ".txt";

            FileWriter writer1 = new FileWriter("C:/Users/HP/IdeaProjects/Homework IT Academy/src/Homework/Task51/catalogOne/allDataFiles.txt", false);

            for (int j = 0; j < 5; j++) {
                FileReader reader = new FileReader("C:/Users/HP/IdeaProjects/Homework IT Academy/src/Homework/Task51/catalogOne/"+ str );
                int res = reader.read();
                while (res != -1){
                    writer1.write(res);
                    res = reader.read();
                }
                t++;
                writer1.flush();
            }
        System.out.println(" ");
        System.out.println("Print all files ");

        FileWriter writer3 = new FileWriter("C:/Users/HP/IdeaProjects/Homework IT Academy/src/Homework/Task51/catalogOne/allFilesInCatalog.txt");

        File folder = new File("D:/tasks/task27/catalogTwo/catalogOne/");
        for (File file : folder.listFiles())
        {
            System.out.println(file.getName());
            writer3.write(String.valueOf(file));
            writer3.append('\n');
            writer3.flush();
        }
        writer3.close();
        writer1.close();
        }

    }

