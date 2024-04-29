package game;

import java.util.ArrayList;
import java.util.List;

import actors.*;
import inventory.Inventory;

public class Room {
    private int row;
    private int col;
    private List<Actor> actors;
    private Inventory inventory;
    
    public Room(int row, int col, Inventory inventory) {
        actors = new ArrayList<>();
        this.row = row;
        this.col = col;
        this.inventory = inventory;
    }

    public String toString() {
        String ans = "";
        ans += "room: " + row + " " + col + "\n";
        ans += inventory.toString();
        ans += "\nActors:\n";
        for(Actor i : actors) {
            ans += i.toString();
            ans += "\n";
        }
        ans += "================================================================\n";
        return ans;
    }
    
    public void addActor(Actor actor) {
        actors.add(actor);
    }
}
