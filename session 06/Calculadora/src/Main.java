import java.util.Scanner;

//void main(){
//
//}

public class Main {
    public static void main(String[] args) {
//         int numero1 = 3;
//         Integer numero2 = new Integer(4);
//        Integer numero2 = 4;
//        Float numero3 = 3.6f;
//        String str = "Hola mama! salgo por la tele!";
//        Boolean bool = true;

        // Input/output
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Bienvenido a la calculadora...");
//
//        System.out.print("Pon un numero entero: ");
//        Integer entrada1 = sc.nextInt();
//        System.out.print("Pon otro numero entero: ");
//        Integer entrada2 = sc.nextInt();
//        System.out.print("Qué quieres hacer? (s: suma, r: resta, m: multiplicacion, d:division) ");
//        String operacion = sc.next();
//
//
//        if (operacion.equals("s")){
//            System.out.print("El resultado es: ");
//            Integer resultado = entrada1 + entrada2;
//            System.out.println(resultado);
//        }
//        else if (operacion.equals("r")){
//            System.out.print("El resultado es: ");
//            Integer resultado = entrada1 - entrada2;
//            System.out.println(resultado);
//        }
//        else if (operacion.equals("m")){
//            System.out.print("El resultado es: ");
//            Integer resultado = entrada1 * entrada2;
//            System.out.println(resultado);
//        }
//        else if (operacion.equals("d")){
//            System.out.print("El resultado es: ");
//            Double entradaFloat1 = Double.parseDouble(entrada1.toString());
//            Double entradaFloat2 = Double.parseDouble(entrada2.toString());
//            Double resultado = entradaFloat1 / entradaFloat2;
//            // Integer resultado = entrada1 / entrada2;
//            System.out.println(resultado);
//        }
//        else{
//            System.out.println("que haga que?!?!");
//        }


//        System.out.println("Bienvenido a la calculadora...");
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Pon un numero entero: ");
//        Integer entrada1 = sc.nextInt();
//        System.out.print("Pon otro numero entero: ");
//        Integer entrada2 = sc.nextInt();
//        System.out.print("Qué quieres hacer? (s: suma, r: resta, m: multiplicacion, d:division) ");
//        String operacion = sc.next();
//
//        if (operacion.equals("s")) {
//            Integer result = Calculator.suma(entrada1, entrada2);
//            System.out.println("El resultado es: " + result);
//        }
//        else if (operacion.equals("r")) {
//            Integer result = Calculator.resta(entrada1, entrada2);
//            System.out.println("El resultado es: " + result);
//        }
//        else if (operacion.equals("m")) {
//            Integer result = Calculator.multiplicacion(entrada1, entrada2);
//            System.out.println("El resultado es: " + result);
//        }
//        else if (operacion.equals("d")) {
//            Double result = Calculator.division(entrada1, entrada2);
//            System.out.println("El resultado es: " + result);
//        }
//        else{
//            System.out.println("Que haga que?!");
//        }

        Menu2 menu = new Menu2(); // new Menu();


        menu.showIntro();

        // System.out.print("Pon un numero entero: ");
        menu.show("Pon un numero entero: ");
        //Integer entrada1 = sc.nextInt();
        Integer entrada1 = menu.getInt();

        menu.show("Pon otro numero entero: ");
        Integer entrada2 = menu.getInt();

        menu.show("Qué quieres hacer?");
        String operacion = menu.getString();

        if (operacion.equals("s")) {
            Integer result = Calculator.suma(entrada1, entrada2);
            menu.show("El resultado es: " + result);
        }
        else if (operacion.equals("r")) {
            Integer result = Calculator.resta(entrada1, entrada2);
            menu.show("El resultado es: " + result);
        }
        else if (operacion.equals("m")) {
            Integer result = Calculator.multiplicacion(entrada1, entrada2);
            menu.show("El resultado es: " + result);
        }
        else if (operacion.equals("d")) {
            Double result = Calculator.division(entrada1, entrada2);
            menu.show("El resultado es: " + result);
        }
        else{
            System.out.println("Que haga que?!");
        }



    }


}

