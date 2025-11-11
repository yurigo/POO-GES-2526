//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Paciente a = new Paciente("Alice", 99);
        Paciente b = new Paciente("Bob", 23);
        Doctor c = new Doctor("Charlie", "Cardiology");

        FileManager.save(a);
        FileManager.save(b);
        FileManager.save(c);


        RegisterManager.register(a);
    }
}