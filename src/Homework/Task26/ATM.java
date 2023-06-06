package Homework.Task26;

public class ATM {
    final int BILLS20 = 20;
    int bills20 = 100;
    final int BILLS50 = 50;
    int bills50 = 80;
    final int BILLS100 = 100;
    int bills100 = 50;

    int cash = BILLS20 * bills20 + BILLS50 * bills50 + BILLS100 * bills100;

    public ATM() {
    };
    public ATM(int bills20, int bills50, int bills100, int cash) {
        this.bills20 = bills20;
        this.bills50 = bills50;
        this.bills100 = bills100;
        this.cash = cash;
    }


    public int getBills20() {
        return bills20;
    }
    public int getBills50() {
        return bills50;
    }
    public int getBills100() {
        return bills100;
    }
    public int getCash() {
        return cash;
    }

    public void setBills20(int bills20) {
        this.bills20 = bills20;
    }
    public void setBills50(int bills50) {
        this.bills50 = bills50;
    }
    public void setBills100(int bills100) {
        this.bills100 = bills100;
    }
    public void setCash(int cash) {
        cash = cash;
    }



}
