import java.util.ArrayList;

public class Inventory {
    public ArrayList<Item> Items = new ArrayList<Item>();
    
    public void Display() {
        for (int i = 0; i < Items.size(); i++) {
            System.out.println("Inventory: " + Items.get(i).Name);
        }
    }
}