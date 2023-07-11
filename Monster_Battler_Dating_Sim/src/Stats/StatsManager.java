package Stats;

import java.util.Random;

class StatsManager extends Monster{
    public StatsManager(int exp, int lvl, String monster, String type1, String type2) {
		super(exp, lvl, monster, type1, type2);
	}

    private int attack = 0;
    private int defense = 0;
    private int specialAttack = 0;
    private int specialDefense = 0;
    private int speed = 0;
    private int hp = 0;
    private int sustenance = 0;
    private int friendship = 0;

    public int randomizeStats() {
        int statMax = 20;
        int statMin = 10;
        int stat = (statMin + (int)(Math.random() * ((statMax - statMin) +1)));
        return stat;
    }
    
    // Make private after completion
    // Make this more efficient
    public void raiseStatsUponLevelUp() {
    	Random random = new Random();
    	int attackIncrease = random.nextInt(4) + 1;
    	int defenseIncrease = random.nextInt(4) + 1;
    	int specialAttackIncrease = random.nextInt(4) + 1;
    	int specialDefenseIncrease = random.nextInt(4) + 1;
    	int speedIncrease = random.nextInt(4) + 1;
    	int hpIncrease = (random.nextInt(8) + 2) * 2;
    	int sustenanceIncrease = random.nextInt(4) + 1;
    	
    	if(getLevelUp()) {
    		attack += attackIncrease;
    		defense += defenseIncrease;
    		specialAttack += specialAttackIncrease;
    		specialDefense += specialDefenseIncrease;
    		speed += speedIncrease;
    		hp += hpIncrease;
    		sustenance += sustenanceIncrease;
    	}
    	setLevelUp(false);		
    }
    
    public void setFriendship(int friend) {
        this.friendship = friend;
    }

    public int getFriendship() {
        return friendship;
    }

    public void setAttack(int atk) {
        this.attack = atk;
    }

    public int getAttack() {
        return attack;
    }

    public void setDefense(int def) {
        this.defense = def;
    }

    public int getDefense() {
        return defense;
    }

    public void setSpAttack(int spAtk) {
        this.specialAttack = spAtk;
    }

    public int getSpAttack() {
        return specialAttack;
    }

    public void setSpDefense(int spDef) {
        this.specialDefense = spDef;
    }

    public int getSpDefense() {
        return specialDefense;
    }

    public void setSpeed(int spd) {
        this.speed = spd;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHP(int hp) {
        this.hp = (int) (hp * 1.5);
    }

    public int getHP() {
        return hp;
    }

    public void setSustenance(int sus) {
        this.sustenance = sus;
    }

    public int getSustenance() {
        return sustenance;
    }
}
