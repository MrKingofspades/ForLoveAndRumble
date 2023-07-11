package Stats;

import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
	private Map<String, Integer> inventory;
	
	public InventorySystem () {
		inventory = new HashMap<>();
	}
	
	// Create a function to add an item(s)
	public void addItem(String item, int amount) {
		int currentAmount = inventory.getOrDefault(item, 0);
		inventory.put(item, currentAmount + amount);
		if(amount > 1) {
			System.out.println("You have obtained " + amount + " " + item + "'s!\n");
		} else {
			System.out.println("You have obtained one " + item + "!\n");
		}
	}
	
	// Create a function to remove item(s) from the inventory
	public void useItem(String item) {
		if(inventory.containsKey(item) && inventory.get(item) > 0) {
			System.out.println("You have used one " + item + "!\n");
			inventory.put(item, inventory.get(item) - 1);
			if(inventory.get(item) < 1) {
				inventory.remove(item);
			}
		}		
	}
	
	// Create a function that will display the inventory
	public void displayInventory() {
		System.out.println("Inventory: ");
			if(inventory.isEmpty()) {
				System.out.println("Empty");
			} else {
				for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
			System.out.println();
	}
}
