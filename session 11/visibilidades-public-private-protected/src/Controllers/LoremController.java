package Controllers;

public class LoremController {
    public void test(){
        GameController gameController = new GameController();
        gameController.a = "a es public y puedo verlo aqui";
        gameController.b = "b es private y NO puedo verlo aquí";
        gameController.c = "c es protected y puedo verlo aqui";
    }
}
