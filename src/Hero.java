public class Hero {
//Atribute
    String userHero;
    int gold;
    double HP,Mana,damage;

//Behavior
    void useheal(){
        System.out.println("Sedang Healing....");
        HP += 100;
    }

    void killHero(Hero userHero){
        gold +=100;
    }

    void killJungle(Hero userHero){
        gold +=50;
    }

    void getHit(Hero userHero){
        damage = 70;
        System.out.println("Menerima " + damage + " basic damage");
        HP = HP-damage;
    }

    //skill1
    void getSkill1(Hero userHero){
        damage = 430;
        System.out.println("Menerima " + damage + " magic damage");
        HP = HP-damage;
    }
    void useSkill1(){
        Mana -=50;
        damage=30;
        System.out.println("Menerima " + damage + " damage dari penggunaan skill");
        HP -=30;
    }


}
