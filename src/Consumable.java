public class Consumable extends Item {
    public int UsesMax = 0;
    public int UsesCurrent = 0;

    public Consumable(int UsesMax, String Name) {
        this.UsesMax=UsesMax;
        this.Name=Name;
    }

    public void Use(Character target) {
        if (UsesCurrent < UsesMax) {
            System.out.println(target.Name+"uses"+this.Name);
            target.Hp += 10;
            UsesCurrent--;
        }
    }
}