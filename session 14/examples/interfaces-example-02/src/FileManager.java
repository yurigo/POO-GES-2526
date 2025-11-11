public class FileManager {
    public static void save(Persistible p){
        System.out.println("Guardando en archivo" + p.toJSON());
    }
}
