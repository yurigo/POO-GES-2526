import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog("Eustaquio" , 10);
        Cat c = new Cat("Balrog", 30);
        Capybara capy = new Capybara("Destroyer of worlds", 55);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(d);
        animals.add(c);
        animals.add(capy);

        // Animal c = new Animal();  // animal es abstracto, no puede ser instanciado

        for (Animal a : animals) {
            a.showInfo();
            a.talk();
            System.out.println();
        }
    }
}