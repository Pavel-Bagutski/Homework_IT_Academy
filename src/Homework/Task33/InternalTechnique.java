package Homework.Task33;

public class InternalTechnique extends KitchenAppliances{

     int price = 0;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "InternalTechnology{" +
                "price=" + price +
                ", sizeApliances='" + sizeApliances + '\'' +
                ", power=" + power +
                ", isNewAppliances=" + isNewAppliances +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

