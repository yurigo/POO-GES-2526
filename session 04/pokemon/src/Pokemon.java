public class Pokemon {

    private int idPokedex;
    private String nickname;
    private String specie;
    private String typePrimary;
    private String typeSecondary;
    private int hp;
    private int lvl;

    public Pokemon(int idPokedex,
                   String nickname,
                   String specie,
                   String type1,
                   String type2,
                   int hp,
                   int lvl){

        this.idPokedex = idPokedex;
        this.nickname = nickname;
        this.specie = specie;
        this.typePrimary = type1;
        this.typeSecondary = type2;
        this.hp = hp;

        if (lvl > 100){
            this.lvl = 100;
        }
        else{
            this.lvl = lvl;
        }


    }


    public void show(){
        System.out.println("Pokemon:");
        System.out.println("idPokedex: " + idPokedex);
        System.out.println("nickname: " + nickname);
        System.out.println("level: " + lvl);
    }
}
