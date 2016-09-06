
public class Potion extends Item {
	private int addHP;
	public Potion() {
		setName("Potion");
		addHP = 50;
		setDescription("Une potion qui reg�n�re les points de vie de " + addHP + "HP");
	}
	public Potion(int level)
	{
		setName("Potion");
		addHP = 50 * level;
		setDescription("Une potion qui reg�n�re les points de vie de " + addHP + "HP");
	}
	@Override
	public void use(Personnage character) {
		character.setHp(character.getHp() + this.addHP);
		System.out.println(character.getName() + " a utilis� " + this.getName() + " et gagne " + this.addHP + "HP");
	}

}
