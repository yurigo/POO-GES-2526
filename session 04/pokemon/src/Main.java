


void main(){
    Trainer ash = new Trainer(1, 100 , "Ash Ketchum");
    Trainer misty = new Trainer(2, 30, "Misty");
    Trainer brock = new Trainer(3, 100, "Brock");

    // todo lo comentado me lo puedo ahorrar porque uso constructores!

    Pokemon pikachu = new Pokemon(25,"pikachu", "Pikachu", "Electric", null, 300, 555);
//    pikachu.setLvl(600);
//    pikachu.setSpecie("Pikachu");
//    pikachu.setNickname("Pikachu");
//    pikachu.setIdPokedex(25);
//    pikachu.setTypePrimary("Electric");
//    pikachu.setHp(300);

    Pokemon charmander = new Pokemon(4,"charmander", "Charmander", "Fire", null, 200, 4);
//    charmander.setLvl(26);
//    charmander.setSpecie("Charmander");
//    charmander.setNickname("Charmander");
//    charmander.setIdPokedex(4);
//    charmander.setTypePrimary("Fire");
//    charmander.setHp(100);

    Pokemon psyduck = new Pokemon(54,"psyduck", "Psyduck", "Water", null, 200, 314);
//    psyduck.setLvl(26);
//    psyduck.setSpecie("Psyduck");
//    psyduck.setNickname("Misty's Psyduck");
//    psyduck.setIdPokedex(54);
//    psyduck.setTypePrimary("Water");
//    psyduck.setHp(314);


//    ash.setId(1);
//    ash.setName("Ash Ketchum");
//    ash.setLvl(30);
    ash.setP1(pikachu);
    ash.setP2(charmander);

//    misty.setId(2);
//    misty.setName("Misty");
//    misty.setLvl(30);
    misty.setP1(psyduck);

    Pokemon pikachu2 = new Pokemon(25,"Brock's Pikachu", "Pikachu", "Electric", null, 90, 2);

    brock.setP1(pikachu2);

    ash.show();
    misty.show();
    brock.show();



    Trainer sabrina = new Trainer(5, 3 , "Sabrina");

    sabrina.setP1(new Pokemon(56, "gengarito", "Gengar", "Shadow", null, 150, 50));
    sabrina.setP6(new Pokemon(10, "garchompito", "Garchomp", "Fight", null, 350, 12));

    sabrina.show();

}