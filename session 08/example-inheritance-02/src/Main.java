import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dueño alice = new Dueño("Alice Doe");
        Dueño bob = new Dueño("Bob Doe");

//        List perros = new ArrayList();
//        List gatos = new ArrayList();
//        List pajaros = new ArrayList();
//        List capybaras = new ArrayList();
//        List hormigas = new ArrayList();

        List<Animal> animales = new ArrayList<Animal>();

        animales.add(new Perro("Francisco" , "chiuaua",  24, 1234, bob));
        animales.add(new Perro("Algodón de azucar", "Doberman", 12, 4321, bob));
        animales.add(new Gato("Dolores" , "egipcio", 34, 653, alice));
        animales.add(new Pajaro("Piolin", "periquito", 64, 672, alice));

        for(Animal a : animales){
            a.habla();
        }

    }
}