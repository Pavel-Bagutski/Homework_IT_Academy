package Homework.Task16;
//Найти среди чисел от 50 до 70 второе простое число(число называется простыи, если оно делится без остатка
// только на 1 и себя) и завершить цикл с использовагнием break.

public class Main {
    public static void main(String[] args) {

        int firsNumber = 50;
        int secondNumber = 70;

        boolean search = true;
        boolean isSimple = false;
        int count = 0;
        int n = firsNumber;

        while (search){
            for (int i = 2; i < n  ; i++) {
                if ((n % i != 0)) {
                    isSimple = true;
                }else if (n % i == 0){
                    isSimple = false;
                    break;
                }
            }
            if (isSimple == true) {
                count++;
                System.out.println(n);
                isSimple = false;
                if(count == 2) {
                    System.out.println("simple number two is = " + n);
                    break;
                }
            }
            n++;
            if(n == secondNumber) search = false;
        }
    }
}
