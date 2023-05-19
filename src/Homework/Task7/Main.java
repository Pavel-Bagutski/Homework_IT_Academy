package Homework.Task7;
// Создайте метод с одним целочисленным параметром. Метод должен определить, является ли последняя цифра числа
// семеркой и вернуть boolean значение.

public class Main {
    public static void main(String[] args) {
        IsSeven isSeven = new IsSeven();
        System.out.println(isSeven.ifSevenTrue(4567));

    }
}
class IsSeven {
    public boolean ifSevenTrue(int number) {
        if (number % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }
}
