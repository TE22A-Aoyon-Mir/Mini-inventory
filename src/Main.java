import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the inventory");
        Scanner keyboard = new Scanner(System.in);
        Character mCharacter = new Character();
        System.out.println("Showing the characters inventory");
        mCharacter.Backpack.Display();
    }
}