package actors;

import inventory.Inventory;

public class Enemy extends Actor {
   
    public Enemy() {
        inventory = new Inventory();
    }

    public String toString() {
        String s = "Enemy\n";
        s += inventory.toString();
        return s;
    }
}
