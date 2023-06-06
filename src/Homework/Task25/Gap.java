package Homework.Task25;

public class Gap {

    int hour;
    int minute;
    int second;

    public Gap() {
    }

    public Gap(int hour, int minute, int second) {
        this.minute = minute;
        this.hour = hour;
        this.second = second;
        gapAllSeconds(hour, minute, second);
    }

    public Gap(int second) {
        this.second = second;
        gapHourMinuteSeconde(second);
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public int getSecond() {
        return second;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setSecond(int second) {
        this.second = second;
    }


    public int gapAllSeconds(int hour, int minute, int second) {
        int minuteSecond = minute * 60;
        int hourSecond = hour * 60 * 60;
        int sum = minuteSecond + hourSecond + second;
        System.out.println("all time: " + sum);
        return sum;
    }

    public int gapHourMinuteSeconde(int sumTime) {
        int plusMinut = sumTime / 60;
        int second = sumTime - (plusMinut * 60);
        int hour = (plusMinut / 60);
        int minut = plusMinut - (hour * 60);
        System.out.println("hour, minute and second: " + hour + "," + minut + "," + second);
        return hour;
    }

}