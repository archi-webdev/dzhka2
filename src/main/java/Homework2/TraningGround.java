package Homework2;

public class TraningGround {
    public static void main(String[] args) {

        Hero warrior = new Warrior("Наруто",15);
        Hero mage = new Mage("Саске",20);
        Hero archer = new Archer("Итачи",10);


      Enemy enemy = new Enemy("Орочимару",100);
       attackEnemy(enemy,warrior,mage,archer);



    }

    public  static  void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.IsAlive()) {
            for (Hero hero : heroes) {
                if (enemy.IsAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
