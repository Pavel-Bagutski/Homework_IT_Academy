package Homework.Task59;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileGenerator implements Callable<List<String>> {

    @Override
    public List<String> call() throws Exception {
        List<String> fileWorld = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String filename =  "file_" + i + "_" +generateRandomString() + ".txt";
            File file = new File("src/Homework/Task59/" + filename);
            System.out.println(Thread.currentThread().getName() + " create and writing file " + filename);
            try (FileWriter fileWriter = new FileWriter(file)) {
                for (int j = 0; j < 10; j++) {
                    fileWriter.write(generateRandomString() + "\n");
                }
            }
            fileWorld.add(filename);
            Thread.sleep(getRandomSleepTime());
        }
        return fileWorld;
    }

    private String generateRandomString() {
        Random random = new Random();
        char[] chars = new char[10];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('a' + random.nextInt(26));
        }
        return new String(chars);
    }

    private int getRandomSleepTime() {
        Random random = new Random();
        return random.nextInt((3000 - 1000 + 1) + 1000);
    }
}