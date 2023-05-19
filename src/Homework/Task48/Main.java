package Homework.Task48;
//Созать файл с текстом, прочитать, подсчитать тексте количество знаков препинпния и слов. Вывести результат на экран

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/Homework/Task48/wordsCount.txt");
        StringBuffer stringBuffer = new StringBuffer();

        int result = fileReader.read();
        while (result != -1) {
            stringBuffer.append((char) result);
            result = fileReader.read();
        }
        System.out.println(stringBuffer.toString());
        String[] strWorld = String.valueOf(stringBuffer).replaceAll("[\\w+]", " ").split("\\s+");
        String[] strSign = String.valueOf(stringBuffer).replaceAll("[A-Za-zА-Яа-я0-9]", " ").split("\\s+");

        int countWorlds = 0;
        int countSign = 0;
        System.out.println(" ");
        for (String str1 : strWorld) {
            System.out.print(str1 + " ");
            countWorlds++;
        }
        System.out.println(" ");
        for (String str2 : strSign) {
            System.out.print(str2 + "  ");
            countSign++;
        }
        System.out.println("");
        System.out.println("world = " + countWorlds + "\n" + "sign = " + countSign);
        fileReader.close();
    }
}