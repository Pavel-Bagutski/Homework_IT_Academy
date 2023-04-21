package Homework.Task35;

public class Engineer extends Foreman {

    public Engineer(float perCentOfProd, float rateOfProd, float hour, float rate ) {
        super.perCentOfProduct = perCentOfProd;
        super.rateOfProduct = rateOfProd;
        super.workingHours = hour;
        super.hourlyRate = rate;
        System.out.println(toString() + " -- " + mixedOfPayment() + " BYN");
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "workingHours=" + workingHours +
                ", hourlyRate=" + hourlyRate +
                ", perCentOfProduct=" + perCentOfProduct +
                ", rateOfProduct=" + rateOfProduct +
                '}';
    }
}
