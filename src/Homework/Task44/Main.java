package Homework.Task44;
// Написать код, который выбрасывает NullPointerException. Написать обработчки кода этого исключения и вывести на
// экран сообщение, которое будет содержать описание данного исключения.

public class Main {
    public static void main(String[] args) {

        Integer numberOfNull = null;
        int i = 1;

        try {
            i = i + numberOfNull;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage() );
        }
    }
}
