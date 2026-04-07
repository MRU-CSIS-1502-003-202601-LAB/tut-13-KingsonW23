package main;

public class Consumable extends Loot {
    
    private int restoreAmount;

    public Consumable(String name, String rarity, int restoreAmount) {
        super(name, rarity);
        this.restoreAmount = restoreAmount;
    }

    @Override
    public String getEffectDescription() {
        return String.format("%s (%s): %d points", getName(), getRarity(), restoreAmount); 
    }

    @Override
    public String asCSVRecord() {
        return String.format("Consumable,%s,%s,%d", getName(), getRarity(), restoreAmount);
    }
}
