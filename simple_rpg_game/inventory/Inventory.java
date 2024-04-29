package inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
        generateInventory();
    }
    public void generateInventory() {
        Random rand = new Random();
        int randArmor = rand.nextInt(3);
        for(int i = 0; i < randArmor; ++i) {
            int randPower = rand.nextInt(100);
            Armor armor = new Armor(randPower);
            items.add(armor);
        }
        int randWeapon = rand.nextInt(3);
        for(int i = 0; i < randWeapon; ++i) {
            int randPower = rand.nextInt(100);
            Weapon weapon = new Weapon(randPower);
            items.add(weapon);
        }
        int randPoison = rand.nextInt(3);
        for(int i = 0; i < randPoison; ++i) {
            int randPower = rand.nextInt(100);
            Poison poison = new Poison(randPower);
            items.add(poison);
        }
        int randHeal = rand.nextInt(3);
        for(int i = 0; i < randHeal; ++i) {
            int randPower = rand.nextInt(100);
            HealthPotion healthPotion = new HealthPotion(randPower);
            items.add(healthPotion);
        }
    }

    public String toString() {
        String space = "      ";
        String ans = "Inventories:\n";
        for(Item i : items) {
            ans += space;
            ans += i.toString();
            ans += "\n";
        }
        return ans;
    }
}
