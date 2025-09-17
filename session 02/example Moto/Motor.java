public class Motor{
    private int cilindrada;
    private int revolucionesPorSegundo;
    
    public void acelerar(int cuanto){
        revolucionesPorSegundo = revolucionesPorSegundo + cuanto;
    }
    
    public void decelerar(int cuanto){
        revolucionesPorSegundo = revolucionesPorSegundo - cuanto;
    }
}