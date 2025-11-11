import java.util.Scanner;

public class Menu implements MenuInterface {
    Scanner sc;

    public Menu(){
        this.sc = new Scanner(System.in);
    }

    @Override
    public void showIntro() {
        System.out.println("Bienvenido a la calculadora...");
    }

    @Override
    public void show(String s) {
        System.out.println(s);
    }

    @Override
    public Integer getInt() {
        Integer i = sc.nextInt();
        sc.nextLine(); // Clear the newline character
        return i;
    }

    @Override
    public String getString() {
        return sc.nextLine();
    }
}
