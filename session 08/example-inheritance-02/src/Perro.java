public class Perro extends Animal {


    public Perro(String nombre, String raza, int edad, int chip, Dueño dueño){
        super(nombre, raza, edad, chip, dueño);
    }

    @Override
    public void habla(){
        System.out.println(super.getNombre() + " dice: ");
        System.out.println("Woof woof");
    }
}
