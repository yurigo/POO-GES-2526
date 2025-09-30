public class Trainer {
    private int id;
    private int lvl;
    private String name;

    // private new pokemon Pokemon[6];
    // Pokemon[] pokemons = new Pokemon[6];

    private Pokemon p1;
    private Pokemon p2;
    private Pokemon p3;
    private Pokemon p4;
    private Pokemon p5;
    private Pokemon p6;

//    public Trainer(){
//        System.out.println("Trainer constructor");
//        this.id = 3;
//        this.lvl = 100;
//        this.name = "Brock";
//    }

    public Trainer(int id, int lvl, String name){
        this.id = id;
        this.lvl = lvl;
        this.name = name;
    }

    public void show(){
        System.out.println("Trainer show");
        System.out.println("ID: " + this.id);
        System.out.println("LVL: " + this.lvl);
        System.out.println("Name: " + this.name);

        if (this.p1 != null) {
            System.out.println("P1: ");
            this.p1.show();
        }

        if (this.p2 != null ){
            System.out.println("P2: ");
            this.p2.show();
        }

        if (this.p3 != null) {
            System.out.println("P3: ");
            this.p3.show();
        }

        if (this.p4 != null) {
            System.out.println("P4: ");
            this.p4.show();
        }

        if (this.p5 != null) {
            System.out.println("P5: ");
            this.p5.show();
        }

        if (this.p6 != null) {
            System.out.println("P6: ");
            this.p6.show();
        }
    }




    public void setP1(Pokemon p1) {
        this.p1 = p1;
    }

    public void setP2(Pokemon p2) {
        this.p2 = p2;
    }

    public void setP3(Pokemon p3) {
        this.p3 = p3;
    }

    public void setP4(Pokemon p4) {
        this.p4 = p4;
    }

    public void setP5(Pokemon p5) {
        this.p5 = p5;
    }

    public void setP6(Pokemon p6) {
        this.p6 = p6;
    }


}
