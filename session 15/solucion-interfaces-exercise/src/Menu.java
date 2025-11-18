import java.util.Scanner;

public class Menu implements MenuInterface {
    private Scanner sc;

    public Menu() {
        this.sc = new Scanner(System.in);
    }

    public void showMenu() {
        this.show("");
        this.show("-----------------------------------------------------------");
        this.show("1. Añadir paciente");
        this.show("2. Listar pacientes (orden de inserción)");
        this.show("3. Listar pacientes (orden por prioridad)");
        this.show("4. Listar pacientes (orden alfabético)");
        this.show("5. Salir");
        this.show("-----------------------------------------------------------");
    }

    @Override
    public void show(String s) {
        System.out.println(s);
    }

    @Override
    public void showRespuesta(String s) {
        System.out.print(s);
    }

    @Override
    public Integer getInt(int min, int max) {
        Integer num = null;

        while (true) {
            try {
                String input = sc.nextLine();
                num = Integer.parseInt(input);
                if (num < min || num > max) throw new NumberOutOfLimitsException();
                else break;
            } catch (Exception e) {
                this.showRed("Entrada inválida: \" + e.getMessage() +\". Por favor, ingrese un número correcto: ");
            }
        }
        return num;
    }

    @Override
    public String getString() {
        return sc.nextLine();
    }

    public void showRed(String s){
        System.out.print("\u001B[31m" + s + "\u001B[0m");
    }
}
