import game.*;
import inventory.Inventory;
import actors.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Game game = new Game(4, 3, 20, player);
        game.printMap();
    }
}