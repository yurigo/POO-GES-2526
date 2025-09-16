public class Hospital{
    
    public String name;
    public int numOfDoctors;
    public int numOfPatients;
    public String address;
    public int numOfCoffeeShops;
    public boolean state;
    
    public void open(){
        state = true;
    }
    
    public void close(){
        state = false;
    }
    
    public void print(){
        System.out.println("Nombre: " + name + ", Cafeterias: " + numOfCoffeeShops);
    }
}