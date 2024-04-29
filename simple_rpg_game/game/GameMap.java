package game;

import java.util.Random;

import actors.*;
import inventory.*;

public class GameMap {
    private int width;
    private int length;
    private Room[][] grid;
    private int maxEnemies = 20;
    public GameMap(int width, int length) {
        this.width = width;
        this.length = length;
        grid = new Room[width][length];
        initializeMap();
    }

    private void initializeMap() {
        for (int row = 0; row < width; row++) {
            for (int col = 0; col < length; col++) {
                Inventory inventory = new Inventory();
                grid[row][col] = new Room(row, col, inventory); 
            }
        }
    }

    public void addEnemies() {
        Random rand = new Random();
        
        for (int row = 0; row < width; row++) {
            for (int col = 0; col < length; col++) {
                int randNum = rand.nextInt(4);
                while(randNum > maxEnemies) {
                    randNum = rand.nextInt(2);
                }
                for(int i = 0; i < randNum; ++i) {
                    Enemy enemy = new Enemy();
                    grid[row][col].addActor(enemy);
                }
            }
        }
    }

    public void putPlayer(Player player) {
        Random rand = new Random();
        int randRow = rand.nextInt(width);
        int randCol = rand.nextInt(length);

        grid[randRow][randCol].addActor(player);
    }

    public String printMap() {
        String s = "";
        for (int row = 0; row < width; row++) {
            for (int col = 0; col < length; col++) {
                s += grid[row][col].toString();
            }
            s += "\n";
        }
        return s;
    }
}
