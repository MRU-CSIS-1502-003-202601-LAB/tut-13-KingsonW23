package main;

import java.util.ArrayList;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Manages the inventory of RPG Loot.
 */
public class LootManager {
    private ArrayList<Loot> inventory;

    private LootManager() {
        this.inventory = new ArrayList<>();
    }

    // public static LootManager load(String filePath) throws FileNotFoundException {
    //     LootManager lootManager = new LootManager();

    //     Scanner scanner = new Scanner(new File(filePath));

    //     scanner.nextLine(); 

    //     while (scanner.hasNextLine()) {
    //         String line = scanner.nextLine();

    //         String[] content = line.split(",");

    //         Loot loot = LootFactory.create(content);

    //         lootManager.addLoot(loot); 
    //     }

    //     scanner.close();
    //     return lootManager; 
    // }

    /**
     * Polymorphically displays all items in the inventory.
     */
    public void displayInventory() {
        System.out.println();
        System.out.println("--- Current Inventory ---");
        for (Loot item : inventory) {
            System.out.println(item.getName() + " [" + item.getRarity() + "] - " +
            item.getEffectDescription());
        }
        System.out.println("-------------------------");
        System.out.println();
    }

    public void save(String filePath) {

    }

    public void add(Loot loot) {

    }
}

