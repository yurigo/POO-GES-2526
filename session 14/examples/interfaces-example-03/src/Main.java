import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Patient a = new Patient("Alice", 10);
        Patient b = new Patient("Bob", 4);
        Patient c = new Patient("Charlie", 9);
        Patient d = new Patient("Dave", 8);
        Patient e = new Patient("Eevee", 10);



        // quiero comparar a y b;
        int resultado = a.compareTo(b);

        System.out.println("Resultado de comparar a y b: " + resultado);

        // quiero comparar a y d:
        resultado = a.compareTo(d);
        System.out.println("Resultado de comparar a y d: " + resultado);


        List<Patient> pacientes = new ArrayList<Patient>();
        pacientes.add(a);
        pacientes.add(b);
        pacientes.add(c);
        pacientes.add(d);
        pacientes.add(e);

        System.out.println("Lista de pacientes antes de ordenar:");
        for (Patient p : pacientes) {
            System.out.println(p.getNombre() + " - " + p.getEdad());
        }

        Collections.sort(pacientes);


        System.out.println("Lista de pacientes despues de ordenar:");
        for (Patient p : pacientes) {
            System.out.println(p.getNombre() + " - " + p.getEdad());
        }
    }
}