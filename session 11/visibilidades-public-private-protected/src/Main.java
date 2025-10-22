import Controllers.GameController;

public class Main{
    public static void main(String[] args){
        GameController gameController = new GameController();
        gameController.a = "puedo acceder a 'a' porque es public";
        gameController.b = "no puedo acceder a 'b' porque es private";
        gameController.c = """
                            no puedo acceder a 'c' porque es
                            protected y Main y GameController no estan
                            en el mismo paquete;
                            """;
    }
}