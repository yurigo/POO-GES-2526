import java.util.ArrayList;
import java.util.List;

public class Animal {
    protected String nombre;
    private String raza;
    private int edad;
    private int chip;
    // private Dueño[] dueños = new Dueño[8];
    private List dueños = new ArrayList();

    public Animal(String nombre, String raza, int edad, int chip, Dueño dueño){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.chip = chip;
        // this.dueños[0] = dueño;
        dueños.add(dueño);
    }

    public String getNombre() {
        return nombre;
    }

    public void addDueño(Dueño d){
        dueños.add(d);

    }

    public void habla(){
        System.out.println("Habla!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

}
