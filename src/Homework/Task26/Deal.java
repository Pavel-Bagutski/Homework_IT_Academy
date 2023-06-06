package Homework.Task26;

public class Deal {
    static void dealIs () {
        boolean deal = true;
        System.out.println("Deal is rigth");
    }

    public int addMoney (int quantity, int cash){
        int summa = quantity + cash;
        return summa;
    }
    public int getMoney (int quantity, int cash){
        int summa = cash - quantity;
        return summa;
    }
}
