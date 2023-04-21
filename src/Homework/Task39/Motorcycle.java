package Homework.Task39;

public class Motorcycle extends Vehicle{

    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                '}';
    }
}
