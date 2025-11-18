public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int edad;
    private int prioridad;

    public Paciente(String nombre, int edad, int prioridad) {
        this.nombre = nombre;
        this.edad = edad;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente otro) {

        return Integer.compare(this.prioridad, otro.prioridad) != 0 ? Integer.compare(this.prioridad, otro.prioridad) : Integer.compare(this.edad, otro.edad);

//
//        if (Integer.compare(this.prioridad, otro.prioridad) != 0) {
//            return Integer.compare(this.prioridad, otro.prioridad);
//        } else {
//            return Integer.compare(otro.edad, this.edad);
//        }
    }

    @Override
    public String toString() {
        return nombre + " (edad: " + edad + ", prioridad: " + prioridad + ")";
    }

    public String serialize() {
        return nombre + ";" + edad + ";" + prioridad;
    }
}
