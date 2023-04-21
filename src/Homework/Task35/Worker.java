package Homework.Task35;

public class Worker extends Employee {
    public Worker (float hour, float rate){
        super.workingHours = hour;
        super.hourlyRate = rate;
        System.out.println(toString() + " -- " + hourlyPayment() + " BYN");
    };

    @Override
    public String toString() {
        return "Worker{" +
                "workingHours=" + workingHours +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
