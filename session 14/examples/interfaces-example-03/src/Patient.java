import java.io.Serializable;

public class Patient implements Comparable<Patient> {
    private String nombre;
    private int edad;

    public Patient(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


    @Override
    public int compareTo(Patient o) {
        if (this.edad < o.edad) {
            return -1;
        } else if (this.edad > o.edad) {
            return 1;
        }
        return 0;
    }
}
