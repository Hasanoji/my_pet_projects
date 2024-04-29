package inventory;

public class Weapon extends Equipment {
    int attackPower;

    public Weapon(int attackPower) {
        this.attackPower = attackPower;
    }
    public String toString() {
        return "Weapon: with Attack power: " + attackPower;
    }
}
