import actors.Player;
import game.*;
import inventory.Inventory;

public class Game {
    private int width;
    private int height;
    private int maxEnemies;
    private GameMap gameMap;
    Player player;

    public Game(int width, int height, int maxEnemies, Player player) {
        this.width = width;
        this.height = height;
        this.maxEnemies = maxEnemies;
        this.player = player;
        fillGame();
    }

    public void fillGame() {
        this.gameMap = new GameMap(width, height);
        this.gameMap.addEnemies();
        this.gameMap.putPlayer(player);
    }

    public void printMap() {
        String s = gameMap.printMap();
        System.out.print(s);
    }
}
