import java.util.Scanner;

public class ColorMenu implements MenuInterface {
    @Override
    public void showIntro() {
        System.out.println("\u001B[34mBienvenido a la calculadora...\u001B[0m");
    }

    @Override
    public void show(String s) {
        System.out.println("\u001B[32m" + s + "\u001B[0m");
    }

    @Override
    public Integer getInt() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("\u001B[31mEntrada invalida. Por favor, ingrese un numero entero:\u001B[0m");
            }
        }
    }

    @Override
    public String getString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
