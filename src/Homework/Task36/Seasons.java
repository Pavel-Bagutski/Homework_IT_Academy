package Homework.Task36;

public enum Seasons {
    WINTER ("Зимище"),
    SPRING ("Теплая весна"),
    SUMMER ("Жаркое лето"),
    AUTUMN ("Яркая осень");

    String description;

    Seasons (String strDes){
        this.description = strDes;

    }
    public String getDescription() {
        return description;
    }

    public int countOfDays;
    public int getCountOfDays() {
        return countOfDays;
    }
    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

}
