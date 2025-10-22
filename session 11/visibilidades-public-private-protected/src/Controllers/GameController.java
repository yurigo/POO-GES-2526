package Controllers;

public class GameController {
    public String a;
    private String b;
    protected String c;

    public GameController() {
        gameController.a = "a es public y puedo verlo aqui";
        gameController.b = "b es private y puedo verlo aquí";
        gameController.c = "c es protected y puedo verlo aqui";
    }
}
