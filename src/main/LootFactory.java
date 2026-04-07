package main;

public class LootFactory {
    
    public static Loot create(String[] csvRecord) {

        String typeField = csvRecord[0].toUpperCase();

        String name = csvRecord[1];
        String rarity = csvRecord[2];
        int value = Integer.parseInt(csvRecord[3]); 

        switch (typeField) {

            case "WEAPON":
                return new Weapon(name, rarity, value);

            case "CONSUMABLE":
                return new Consumable(name, rarity, value);

            default:
                return null; 
        }
    }
}
