public class NumberOutOfLimitsException extends Exception {
    @Override
    public String getMessage() {
        return "El numero no está entre los valores correctos";
    }
}
