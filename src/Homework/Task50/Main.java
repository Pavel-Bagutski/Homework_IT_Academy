package Homework.Task50;
// Записать с помозщью Java в двоичный файл 20 случайных чисел. Прочитать записанный файл, вывести на экран
// числа и их среднее арифметическое.
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("src/Homework/Task50/numbers.bin"))) {
            for (int i = 0; i < 20; i++) {
                out.write(rand.nextInt(10));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("src/Homework/Task50/numbers.bin"))) {
            int sum = 0;
            for (int i = 0; i < 20; i++) {
                int num = in.read();
                System.out.println(num);
                sum += num;
            }
            double mean = (double) sum / 20;
            System.out.println("Mean: " + mean);
        }catch (IOException e){
        e.printStackTrace();
    }
    }
}
