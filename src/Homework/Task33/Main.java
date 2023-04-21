package Homework.Task33;
// создать цепочку наследования классов, описвыющих бытовою технику. Содзать несколько обтектов описанных классов, часть
// из них включить в розетку. Иерархия должна иметь хотя бы 3 уровня.

public class Main {
    public static void main(String[] args) {

        KitchenAppliances fridge = new KitchenAppliances();
        fridge.isOn();

        InternalTechnique dishwasher = new InternalTechnique();
        dishwasher.isOn();

        KitchenAppliances microwave = new InternalTechnique();
        microwave.isOn();

        System.out.println(fridge + "\n" + dishwasher + "\n" + microwave);
    }
}
