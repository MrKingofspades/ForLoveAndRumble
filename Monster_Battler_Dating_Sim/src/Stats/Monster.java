package Stats;

public class Monster {
	private int experience;
	private int level;
	private String monster; // Monster's name
	private String type1; // Convert to type Type?
	private String type2;
	private Boolean levelUp = false;
	
	// Constructor will work with json data
	public Monster(int exp, int lvl, String monster, String type1, String type2) {
		this.experience = exp;
		this.level = lvl;
		if (lvl < 1) {
			this.level = 1;
		}
		this.monster = monster;
		this.type1 = type1;
		this.type2 = type2;
	}
	
	// This algorithm will increase the maxExperience as the monster levels
	// Make private after completion
	public int calculateMaxExperience() {
		return (int) Math.pow((level / 0.3), 2);
	}

	// Level up the monster
	public void levelUp(String monster) {
		level++;
		// Bring the experience back down to 0
		// Calculate the new maxExperience dependent upon the new level
		System.out.println(monster + " is now level " + level + "!");
		setLevelUp(true);
		
	}
	
	public void setLevel(int level) {
        this.level = level;
        if(level < 1) {
        	this.level = 1;
        }
    }
	
	public void setMonster(String mon) {
		this.monster = mon;
	}
	
	public void setTypeOne(String type1) {
		this.type1 = type1;
	}
	
	public void setTypeTwo(String type2) {
		this.type2 = type2;
	}
	
	public void setLevelUp(Boolean levelUp) {
		this.levelUp = levelUp;
	}
	
	public int getLevel() {
        return level;
    }
	
	public String getTypeOne() {
		return type1;
	}
	
	public String getTypeTwo() {
		return type2;
	}
	
	// Experience getter
	public void gainExperience(int amount) {
		experience += amount;
		int maxExperience = calculateMaxExperience();
		/* Invoke level up method if the current experience exceeds
		the experience needed to level up */
		while(experience >= maxExperience) {
			levelUp(monster);
			maxExperience = calculateMaxExperience();
		}	
	}
	
	// Return the monster's name
	public String getMonster() {
		return monster;
	}
	
	// Return the current amount of experience the monster has at a particular level
	public int getExperience() {
		return experience;
	}

	public Boolean getLevelUp() {
		return levelUp;
	}

	
}
