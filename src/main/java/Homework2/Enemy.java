package Homework2;

public class Enemy implements Mortal {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (IsAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " Погиб");
        } else  {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + " . Осталость " + health);
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    @Override
    public boolean IsAlive() {
        return health > 0;
    }
}
