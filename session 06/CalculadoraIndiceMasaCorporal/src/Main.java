import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // indice de masa corporal.
        // pedir peso.
        // pedir estatura.
        // calcular.

//        Persona p1 = new Persona(
//                "Alice Doe",
//                23,
//                "Española",
//                100.0f,
//                1.0f
//        );
//
//        Persona p2 = new Persona(
//                "Bob Doe",
//                45,
//                "Española",
//                100.0f,
//                1.8f
//        );
//
//        Persona p3 = new Persona(
//                "Charlie Doe",
//                45,
//                "Española",
//                80.0f,
//                1.8f
//        );

        // CalculadoraIMD cimd = new CalculadoraIMC();
        // CalculadoraIMC.calcula()

        // p1.calculaIMC();

//        p1.showIMC();
//
//        // p2.calculaIMC();
//        p2.showIMC();
//
//        // p3.calculaIMC();
//        p3.showIMC();

        // Persona[] personas = new Persona[10000];
        ArrayList<Persona> personas = new ArrayList();

        personas.add(new Persona(
                "Alice Doe",
                23,
                "Española",
                100.0f,
                1.0f
        ));

        personas.add(new Persona(
                "Bob Doe",
                45,
                "Española",
                100.0f,
                1.8f
        ));

        personas.add(new Persona(
                "Charlie Doe",
                45,
                "Española",
                80.0f,
                1.8f
        ));

        for (Persona persona : personas) {
            persona.showIMC();
        }
    }
}