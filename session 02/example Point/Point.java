// public class Point{
    
//     private int x = 100;
//     private int y = 100;
    
//     public void move(int fx, int fy){
//         x = fx;
//         y = fy;
//     }
    
//     public void show(){
//         System.out.println("El punto está en: ("+ x +", "+ y +")");
//     }
// }

public class Point{
    
    private int[] coords = new int[2];
    
    
    public void move(int x, int y){
        coords[0] = x;
        coords[1] = y;
    }
    
    public void show(){
        System.out.println("El punto está en: ("+ coords[0] +", "+ coords[1] +")");
    }
}