import java.util.*;

public class Main {
    public static void main(String[] args) {
        MenuInterface m = new Menu();
        PatientDAO pdao = new PatientCSV();
        Controller c = new Controller(m , pdao);
        c.run();
    }
}
