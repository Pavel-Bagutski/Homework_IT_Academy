package Homework.Task35;

public class Foreman extends Employee {
    public Foreman() {
    }

    public Foreman (float perCentOfProd, float rateOfProd){
        super.perCentOfProduct = perCentOfProd;
        super.rateOfProduct = rateOfProd;
        System.out.println(toString() + " -- " + paymentOfPerCent() + " BYN");
    };

    @Override
    public String toString() {
        return "Foreman{" +
                "perCentOfProduct=" + perCentOfProduct +
                ", rateOfProduct=" + rateOfProduct +
                '}';
    }

}
