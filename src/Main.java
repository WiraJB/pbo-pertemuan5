public class Main {
    public static void main(String[] args) {
    //instance
        Hero player1 = new Hero();
        Hero player2 = new Hero();
        Hero jungle = new Hero();

        player1.userHero = "Wanwan";
        player1.HP = 600;
        player1.gold = 0;
        player1.Mana= 200;

        jungle.userHero="Klomang";

        player2.userHero = "Eudora";
        player2.HP = 500;
        player2.gold = 0;
        player2.Mana= 300;

        System.out.println("HP "+ player1.userHero+ " Saat ini " + player1.HP);
        System.out.println("HP "+ player2.userHero+ " Saat ini " + player2.HP);
        System.out.println("Gold " + player1.userHero + "= "+ player1.gold);
        System.out.println("MP "+ player1.userHero+ " Saat ini " + player1.Mana);
        System.out.println("MP "+ player2.userHero+ " Saat ini " + player2.Mana);
        player2.getHit(player1);
        System.out.println("HP "+ player1.userHero+ " Saat ini " + player1.HP);
        System.out.println("HP "+ player2.userHero+ " Saat ini " + player2.HP);
        System.out.println("MP "+ player1.userHero+ "  Saat ini " + player1.Mana);
        player1.useSkill1();
        player2.getSkill1(player1);
        System.out.println("HP "+ player1.userHero+ " Saat ini " + player1.HP);
        System.out.println("HP "+ player2.userHero+ "  Saat ini " + player2.HP);
        System.out.println("MP "+ player1.userHero+ " Saat ini " + player1.Mana);

        if (player2.HP == 0) {
            player1.killHero(player2);
        }
        player1.killJungle(jungle);

        System.out.println("Gold = "+ player1.gold);

        player1.useheal();
        System.out.println("HP "+ player1.userHero+ " Saat ini " + player1.HP);
        System.out.println("MP "+ player1.userHero+ " Saat ini " + player1.Mana);
    }
}
