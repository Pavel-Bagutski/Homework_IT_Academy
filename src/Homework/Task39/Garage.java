package Homework.Task39;


public class Garage <T extends Vehicle> {

    private T vehiclel;

    public Garage (T vehicl){
        this.vehiclel = vehicl;
    }
    public T getVehiclel() {
        return vehiclel;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "vehiclel=" + vehiclel +
                '}';
    }
}
