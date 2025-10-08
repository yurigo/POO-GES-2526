import java.io.BufferedReader;
import java.io.FileReader;

class Main {
    public static void main(String[] args) {
        String nombreArchivo = "assets/fichero.txt";
        // Crear un objeto FileReader para leer el archivo

        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Inicializar contador de palabras
            int contadorPalabras = 0;

            String linea;
            // Leer el archivo línea por línea
            while ((linea = bufferedReader.readLine()) != null) {
                // Dividir la línea en palabras utilizando espacios como delimitadores
                String[] palabras = linea.split(" ");
                // Incrementar el contador de palabras por la cantidad de palabras en la línea
                contadorPalabras += palabras.length;
            }

            // Cerrar el FileReader
            bufferedReader.close();

            // Mostrar el resultado
            System.out.println("El archivo " + nombreArchivo + " contiene " + contadorPalabras + " palabras.");

        }
        catch(java.io.FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo " + nombreArchivo);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}