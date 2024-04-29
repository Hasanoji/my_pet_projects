package inventory;

public class Armor extends Equipment{
    int defensePower;

    public Armor(int defensePower) {
        this.defensePower = defensePower;
    }

    public String toString() {
        return "Armor: with Defense power: " + defensePower;
    }
}
