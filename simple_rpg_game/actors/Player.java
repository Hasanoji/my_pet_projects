package actors;

import inventory.Inventory;

public class Player extends Actor {

    public Player() {
        inventory = new Inventory();
    }
    
    public String toString() {
        String s = "Player\n";
        s += inventory.toString();
        return s;
    }
}
