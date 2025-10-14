public class Main {

    public static void main(String[] args) {

        // Intenta realizar una división por cero

        int resultado = dividir(10, 0);
        System.out.println("El resultado es: " + resultado);
        System.out.println("Fin del programa.");
    }

    public static int dividir(int numerador, int denominador) throws Exception {
        // Intenta realizar la división

//        if (denominador == 0) {
//            Exception a = new Exception("Holi!! El denominador no puede ser 0");
//            throw a;
//        }



        int resultado = 0;
        try{
            resultado = numerador / denominador;
        }
        catch(Exception e) {
            Exception newException = new Exception("Holi!! El denominador no puede ser 0");
            throw newException;
        }
        return resultado;
    }
}

