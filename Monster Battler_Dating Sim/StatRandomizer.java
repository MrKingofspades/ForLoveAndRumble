public class StatRandomizer {
    private int attack = 0;
	private int defense = 0;
	private int specialAttack = 0;
	private int specialDefense = 0;
    private int speed = 0;
    private int hp = 0;
    private int sustenance = 0;

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

    public void setSpDef(int spDef) {
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
        this.hp = hp;
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
