package Homework.Task33;

public class Appliances implements Socket{

    boolean power = false;
    @Override
    public void isOn() {
        power = true;
    }

    boolean isNewAppliances = true;
    String manufacturer = "None";

    public boolean isNewAppliances() {
        return isNewAppliances;
    }
    public void setNewAppliances(boolean newAppliances) {
        isNewAppliances = newAppliances;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    @Override
    public String toString() {
        return "Appliances{" +
                "isNewAppliances=" + isNewAppliances +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
