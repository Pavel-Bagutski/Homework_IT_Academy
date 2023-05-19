package Homework.Task18;
// Задать произвольное целое число и вывести его в бухгалетрком формате, то есть, начиная справа, каждые три
// позиции отделяются пробелом. Например, число 20023143 должно быть выведено как 20 023 143.

public class Main {
    public static void main(String[] args) {
        int number = 20023143;
        String numberString = Integer.toString(number);
        String result = "";
        int i = numberString.length() - 1;
        int count = 0;
        while (i >= 0) {
            result = numberString.charAt(i) + result;
            i--;
            count++;
            if (count == 3 && i >= 0) {
                result = " " + result;
                count = 0;
            }
        }
        System.out.println(result);
    }
}
