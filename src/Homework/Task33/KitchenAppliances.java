package Homework.Task33;

public class KitchenAppliances extends Appliances {

    String sizeApliances = "2 category";


    public String getSizeApliances() {
        return sizeApliances;
    }
    public void setSizeApliances(String sizeApliances) {
        this.sizeApliances = sizeApliances;
    }


    @Override
    public String toString() {
        return "KitchenAppliances{" +
                "sizeApliances='" + sizeApliances + '\'' +
                ", power=" + power +
                ", isNewAppliances=" + isNewAppliances +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
