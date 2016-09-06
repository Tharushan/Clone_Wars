import java.util.ArrayList;

public abstract class Personnage {
	private int hp;
	private int def;
	private int power;
	private int force;
	private int intelligence;
	private int lvl;
	private int xp;
	private String name;
	public ArrayList<Item> inventory  = new ArrayList<Item>();
	
	public void lvlUp()
	{
		lvl += 1;
		hp = (int)(hp * 1.5);
		def = (int)(def * 1.5);
		power = (int)(power * 1.5);
		force = (int)(force * 1.5);
		intelligence = (int)(intelligence * 1.5);
	}
	
	public void physicalAttack(Personnage ennemy)
	{
		int damage = ((power - ennemy.def) > 0 ) ? power - ennemy.def : 10;
		ennemy.hp -= damage;
	}

	abstract public void forceAttack(Personnage ennemy);
	abstract public void armedAttack(Personnage ennemy);
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
