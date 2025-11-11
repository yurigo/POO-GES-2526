import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new MyFList<Integer>();

        Calculator c = new Calculator();

        MenuInterface m = new ColorMenu();

        m.showIntro();
        m.show("Ingrese el primer numero:");
        Integer a = m.getInt();
        m.show("Ingrese el segundo numero:");
        Integer b = m.getInt();
        m.show("Ingrese la operacion a realizar (suma, resta, multiplicacion, division):");
        String operacion = m.getString();
        Integer resultadoInt;
        Double resultadoDouble;

        switch (operacion) {
            case "s":
                resultadoInt = c.suma(a, b);
                m.show("El resultado de la suma es: " + resultadoInt);
                break;
            case "r":
                resultadoInt = c.resta(a, b);
                m.show("El resultado de la resta es: " + resultadoInt);
                break;
            case "m":
                resultadoInt = c.multiplicacion(a, b);
                m.show("El resultado de la multiplicacion es: " + resultadoInt);
                break;
            case "d":
                try {
                    resultadoDouble = c.division(a, b);
                    m.show("El resultado de la division es: " + resultadoDouble);
                } catch (IllegalArgumentException e) {
                    m.show(e.getMessage());
                }
                break;
            default:
                m.show("Operacion no valida.");
                break;
        }

    }
}