package Homework.Task61;

import java.io.File;
import java.io.FileWriter;
import java.sql.Time;
import java.time.LocalTime;
import java.util.concurrent.Callable;

public class TaskCallableHelloWorld implements Callable {

    String hello = "Hello World!";
    File file = new File("src/Homework/Task61/HelloFile.txt");

    @Override
    public Object call() throws Exception {
        synchronized (this) {
            LocalTime time = LocalTime.now();
            FileWriter fileWriter = new FileWriter(file, true);
            String s = hello + " " + String.valueOf(time);
            fileWriter.write(s + "\n");
            fileWriter.flush();

            System.out.println(Thread.currentThread() + ": write in file " + file.getName() + " , write next lime -- " + s);

        }
        return null;
    }
}
