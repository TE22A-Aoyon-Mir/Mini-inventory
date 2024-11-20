import java.util.Random;

public class Weapon extends Item {
    public int MinDamage;
    public int MaxDamage;

    public int Attack() {
        Random rand = new Random();
        int damage = rand.nextInt(MinDamage, MaxDamage + 1);
        return damage;
    }
}