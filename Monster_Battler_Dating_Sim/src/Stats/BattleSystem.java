package Stats;

public class BattleSystem {
	private String monster;
	private int lvl;
	private int exp; // How much EXP the monster gives you if you defeat it
		
	public BattleSystem(String monster, int lvl, int exp) {
		this.monster = monster;
		this.lvl = lvl;
		if (lvl < 1) {
			this.lvl = 1;
		}
		this.exp = (int) Math.pow(lvl * 2, 1.7);
	}

	// What to call when the enemy appears, initiates the battle
	public void enemyAppears() {
		System.out.println("A wild " + monster + " appears before you!\n");
	}
	
	// Check winner, if player health is less than or equal to zero, player loses
	// if enemy's health is less than or equal to zero, player wins
	public void checkWinner() {
		
	}
	
	public int getExp() {
		return exp;
	}
	
	public int getLvl() {
		return lvl;
	}
	
	public String getMonster() {
		return monster;
	}
	
	public void setMonster(String monster) {
		this.monster = monster;
	}
	
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
}
