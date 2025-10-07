import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pon numeros separados por espacio");
        String entrada = input.nextLine();

        String[] arrEntrada = entrada.split(" ");

        for(int i = 0; i < arrEntrada.length; i++){
            System.out.println("has puesto: " + arrEntrada[i]);
        }

        int suma = 0;
        for(int i = 0; i < arrEntrada.length; i++){
            suma += Integer.parseInt(arrEntrada[i]);
        }

        int suma2 = 0;
        for (String s : arrEntrada) {
            suma2 += Integer.parseInt(s);
        }

        System.out.println("Y la suma es: " + suma);
        System.out.println("Y la suma2 es: " + suma2);

    }
}