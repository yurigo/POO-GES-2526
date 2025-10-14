public class Gato extends Animal {

    public Gato(String nombre, String raza, int edad, int chip, Dueño dueño){
        super(nombre, raza, edad, chip, dueño);
    }


    public void habla(){
        System.out.println(super.getNombre() + " dice: ");
        System.out.println("Meow Meow");
    }
}
