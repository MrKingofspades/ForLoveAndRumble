package Stats;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StatsManager stats = new StatsManager(0, 1, "Adobekit", "Earth", "Normal");
		BattleSystem battle = new BattleSystem("Florabud", 15, 0);
		InventorySystem inventorySystem = new InventorySystem();
		
		inventorySystem.addItem("Potion", 3);
		inventorySystem.addItem("Antidote", 2);
		inventorySystem.addItem("Restore", 6);
		inventorySystem.displayInventory();
		inventorySystem.useItem("Potion");
		inventorySystem.displayInventory();
		inventorySystem.useItem("Potion");
		inventorySystem.displayInventory();
		inventorySystem.useItem("Potion");
		inventorySystem.displayInventory();
		inventorySystem.useItem("Antidote");
		inventorySystem.displayInventory();
		inventorySystem.useItem("Restore");
		inventorySystem.displayInventory();
		inventorySystem.useItem("Potion");
		
//		Monster adobekit = new Monster(0, 1, "Adobekit", "Earth", "Normal");
//		
//		System.out.println("Name: " + stats.getMonster());
//		System.out.println("Typing: " + stats.getTypeOne() + "/" + stats.getTypeTwo());
//		System.out.println("Level: " + stats.getLevel());
//		System.out.println("EXP: " + stats.getExperience());
//		

//		if(adobekit.getMonster() == "Adobekit" && adobekit.getLevel() == 2) {
//			System.out.println("Adobekit has evolved into Terralynx!");
//		}

//		stats.setAttack(stats.randomizeStats());
//		stats.setDefense(stats.randomizeStats());
//		stats.setSpAttack(stats.randomizeStats());
//		stats.setSpDefense(stats.randomizeStats());
//		stats.setHP(stats.randomizeStats());
//		stats.setSpeed(stats.randomizeStats());
//		stats.setSustenance(stats.randomizeStats());
//		System.out.println("Attack: " + stats.getAttack());
//		System.out.println("Defense: " + stats.getDefense());
//		System.out.println("SpAttack: " + stats.getSpAttack());
//		System.out.println("SpDefense: "+ stats.getSpDefense());
//		System.out.println("HP: " + stats.getHP());
//		System.out.println("Speed: " + stats.getSpeed());
//		System.out.println("Sustenance: " + stats.getSustenance());
//		System.out.println("Friendship: " + stats.getFriendship());
//		
//		stats.levelUp("Adobekit");
//		stats.raiseStatsUponLevelUp();
//		
//		System.out.println("Attack: " + stats.getAttack());
//		System.out.println("Defense: " + stats.getDefense());
//		System.out.println("SpAttack: " + stats.getSpAttack());
//		System.out.println("SpDefense: "+ stats.getSpDefense());
//		System.out.println("HP: " + stats.getHP());
//		System.out.println("Speed: " + stats.getSpeed());
//		System.out.println("Sustenance: " + stats.getSustenance());
//		System.out.println("Friendship: " + stats.getFriendship());
//		
//		stats.raiseStatsUponLevelUp();
//		
//		System.out.println("Attack: " + stats.getAttack());
//		System.out.println("Defense: " + stats.getDefense());
//		System.out.println("SpAttack: " + stats.getSpAttack());
//		System.out.println("SpDefense: "+ stats.getSpDefense());
//		System.out.println("HP: " + stats.getHP());
//		System.out.println("Speed: " + stats.getSpeed());
//		System.out.println("Sustenance: " + stats.getSustenance());
//		System.out.println("Friendship: " + stats.getFriendship());
//		
//		stats.levelUp("Adobekit");
//		stats.raiseStatsUponLevelUp();
//		
//		System.out.println("Attack: " + stats.getAttack());
//		System.out.println("Defense: " + stats.getDefense());
//		System.out.println("SpAttack: " + stats.getSpAttack());
//		System.out.println("SpDefense: "+ stats.getSpDefense());
//		System.out.println("HP: " + stats.getHP());
//		System.out.println("Speed: " + stats.getSpeed());
//		System.out.println("Sustenance: " + stats.getSustenance());
//		System.out.println("Friendship: " + stats.getFriendship());
//		
//		stats.raiseStatsUponLevelUp();
//		
//		System.out.println("Attack: " + stats.getAttack());
//		System.out.println("Defense: " + stats.getDefense());
//		System.out.println("SpAttack: " + stats.getSpAttack());
//		System.out.println("SpDefense: "+ stats.getSpDefense());
//		System.out.println("HP: " + stats.getHP());
//		System.out.println("Speed: " + stats.getSpeed());
//		System.out.println("Sustenance: " + stats.getSustenance());
//		System.out.println("Friendship: " + stats.getFriendship());
		
	}

}
