public class Calculator {
    static Integer suma(Integer a,Integer b){
        return a+b;
    }
    static Integer resta(Integer a,Integer b){
        return a-b;
    }
    static Integer multiplicacion(Integer a,Integer b){
        return a*b;
    }

//    static Integer division(Integer a,Integer b){
//        return a/b;
//    }

    static Double division(Integer a, Integer b){
        Double entradaFloat1 = Double.parseDouble(a.toString());
        Double entradaFloat2 = Double.parseDouble(b.toString());
        Double resultado = entradaFloat1 / entradaFloat2;
        return resultado;
    }
}
