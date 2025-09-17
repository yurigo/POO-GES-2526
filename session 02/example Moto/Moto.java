public class Moto{
    private String modelo;
    private Motor motor;
    private Diposito diposito;
    
    void acelerar(cuanto){
        motor.acelerar(cuanto);
        diposito.vaciar(cuanto/1000);
    }
}