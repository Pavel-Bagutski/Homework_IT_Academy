package Homework.Task35;

public class Employee {

    float workingHours;
    float hourlyRate;

    public float hourlyPayment (){
        return workingHours * hourlyRate;
    }

    float perCentOfProduct;
    float rateOfProduct;

    public float paymentOfPerCent (){
        return perCentOfProduct * rateOfProduct;
    }

    public float mixedOfPayment (){
        return (hourlyPayment() + paymentOfPerCent());
    }



}
