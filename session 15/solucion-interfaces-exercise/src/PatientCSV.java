import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Vector;

public class PatientCSV implements PatientDAO{
    public void save(List<Paciente> pacientes){
        String nombreArchivo = "pacientes.csv";
        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Nombre;Edad;Prioridad\r\n");

            for (Paciente p : pacientes) {
                bufferedWriter.write(p.serialize() + "\r\n");
            }

            bufferedWriter.close();

        }
        catch(java.io.FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo " + nombreArchivo);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Paciente> load() {
        List<Paciente> pacientes = new Vector<>();
        String nombreArchivo = "pacientes.csv";

        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;

            bufferedReader.readLine();

            while ((linea = bufferedReader.readLine()) != null) {
                String[] palabras = linea.split(";");



                String nombrePaciente = palabras[0];
                Integer edad = Integer.parseInt(palabras[1]);
                Integer prioridad = Integer.parseInt(palabras[2]);

                pacientes.add(new Paciente(nombrePaciente, edad, prioridad));

            }
            bufferedReader.close();

        }
        catch(java.io.FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo " + nombreArchivo);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return pacientes;
    }
}
