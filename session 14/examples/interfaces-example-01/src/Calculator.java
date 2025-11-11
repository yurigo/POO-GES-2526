public class Calculator {

    public static Integer suma(Integer a, Integer b) {
        return a + b;
    }

    public static Integer resta(Integer a, Integer b) {
        return a - b;
    }

    public static Integer multiplicacion(Integer a, Integer b) {
        return a * b;
    }

    public static Double division(Integer a, Integer b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return Double.valueOf(a) / Double.valueOf(b);
    }
}
