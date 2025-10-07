import java.util.Scanner;

    public class Menu2 {

        Scanner sc;

        public Menu2(){
            sc = new Scanner(System.in);
        }

        public void showIntro(){
            System.out.println(" ++ Bienvenido a la calculadora... ++ " );
        }

        public void show(String s){
            System.out.println("++" + s + "++");
        }

        public Integer getInt(){
            return sc.nextInt();
        }

        public String getString(){
            return sc.next();
        }





    }


