import java.io.*;
import java.util.*;

public class Controller {
    private MenuInterface m;
    private PatientDAO pdao;
    private List<Paciente> listaPacientes;

    public Controller(MenuInterface m, PatientDAO pdao) {
        this.m = m;
        this.pdao = pdao;
        listaPacientes = pdao.load();
    }

    public void run(){
        int opcion;
        do {
            m.showMenu();
            m.showRespuesta("> ");
            opcion = m.getInt(1, 5);

            switch (opcion) {
                case 1 -> AñadirUnNuevoUsuario();
                case 2 -> caso2();
                case 3 -> caso3();
                case 4 -> caso4();
                case 5 -> m.show("Saliendo del programa...");
            }
        } while (opcion != 5);
    }

    /**
     * Opcion para añadir un nuevo usuario al sistema
     */
    private void AñadirUnNuevoUsuario(){
        m.showRespuesta("Nombre: ");
        String nombre = m.getString();

        m.showRespuesta("Edad: ");
        int edad = m.getInt(0,200);

        m.showRespuesta("Prioridad (1-5): ");
        int prioridad = m.getInt(1,5);

        listaPacientes.add(new Paciente(nombre, edad, prioridad));

        pdao.save(listaPacientes);
    }

    private void caso2(){
        m.show("Listado por inserción:");
        for (Paciente p : listaPacientes)
            m.show(p.toString());
    }

    private void caso3(){
        m.show("Listado por prioridad:");
        List<Paciente> copia1 = new ArrayList<>(listaPacientes);
        Collections.sort(copia1);
        for (Paciente p : copia1)
            m.show(p.toString());
    }

    private void caso4(){
        m.show("Listado por orden alfabético:");
        List<Paciente> copia2 = new ArrayList<>(listaPacientes);

        Comparator<Paciente> porNombre = Comparator.comparing(Paciente::getNombre);
        copia2.sort(porNombre);

        for (Paciente p : copia2)
            m.show(p.toString() + "\n");
    }
}
