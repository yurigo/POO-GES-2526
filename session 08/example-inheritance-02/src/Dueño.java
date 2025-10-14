public class Dueño {
    private String nombre;
    private String apellido;

    public Dueño(String str){
        this.nombre = str.split(" ")[0];
        this.apellido = str.split(" ")[1];
    }
}
