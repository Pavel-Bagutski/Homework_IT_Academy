package Homework.Task49;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Создать файл с текстом, в котором присутствуют числа. Найти все числа, вывести на экран, посчитасть сумму, убраит
// все повторяющиеся числа и снова вывести на экран.
public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("src/Homework/Task49/exampleNumbers.txt");
        StringBuffer stringBuffer = new StringBuffer();
        int res = fileReader.read();
        while (res != -1) {
            stringBuffer.append((char) res);
            res = fileReader.read();
        }
        System.out.println(stringBuffer);

        String strNumber = String.valueOf(stringBuffer);
        Pattern pattern = Pattern.compile("0-9");
        Matcher matcher = pattern.matcher(strNumber);

        String[] strSplited = strNumber.replaceAll("[^0-9]", " ").split("\\s");
        int count = 0;
        for (String str :
                strSplited) {
            try {
                count += Integer.valueOf(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("summa is - " + count);
        fileReader.close();
    }
}
