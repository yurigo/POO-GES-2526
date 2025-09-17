public class Deposit{
    private int volumen;
    private float gasolina;
    
    
    // getter y setters
    public void setVolumen(int vol) {
        volumen = vol;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    public void llenar(float cuanto){
        gasolina = gasolina + cuanto;
    }
    
    public void vaciar(float cuanto){
        if (cuanto - gasolina < 0) // error! {
            
        }
        gasolina = gasolina - cuanto;
    }
}