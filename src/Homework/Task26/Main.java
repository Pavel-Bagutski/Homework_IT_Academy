package Homework.Task26;
//Создать класс описывающие Банкомат. Набор купюр банкомате, должен задаваться тремя свойствами количеством
// купюр номиналом 20 50, 100. Сделать методы для добавления денег в банкомат. Сделать метод, снимающий деньги.
//  С клавиатуры передается сумма денег.На экран булевское значенин (операция удалась или нет)
//  При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
//  Создать конструктор с тремя параметрами — количеством купюр. Прочее - на ваше усмотрение.

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        Deal deal = new Deal();
        ATM atm = new ATM();
        System.out.println("Cash in ATM " + atm.cash + " $");

        boolean isWork = true;
        while (isWork) {
            System.out.println("Enter operation \n1 - add \n2 - take \n3 - exit");
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.println("Enter summa add");
                atm.cash = deal.addMoney(scanner.nextInt(), atm.cash);
                System.out.println(atm.cash);
            } else if (n == 2) {
                System.out.println("Enter summa of withdraw money");
                atm.cash = deal.getMoney(scanner.nextInt(), atm.cash);
                System.out.println(atm.cash);
            } else if (n == 3) {
                System.out.println("Your balance is " + atm.cash + " Have a good day");
                isWork = false;
            }

        }
    }
}
