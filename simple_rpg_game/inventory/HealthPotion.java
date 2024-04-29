package inventory;

public class HealthPotion extends Consumable {
    int healingPower;

    public HealthPotion(int healingPower) {
        this.healingPower = healingPower;
    }

    public String toString() {
        return "Health Potion: with Healing power: " + healingPower;
    }
}
