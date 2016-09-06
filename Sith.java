
public class Sith extends Personnage{

	public Sith() {
		setLvl(1);
		setXp(0);
		setHp(100);
		setDef(100);
		setPower(200);
		setForce(200);
		setIntelligence(200);
	}
	public Sith(String name) {
		setLvl(1);
		setName(name);
		setXp(0);
		setHp(100);
		setDef(100);
		setPower(200);
		setForce(200);
		setIntelligence(200);
	}
	
	public Sith(int level) {
		setLvl(1);
		setXp(0);
		setHp(100);
		setDef(100);
		setPower(200);
		setForce(200);
		setIntelligence(200);
		for (int i = getLvl(); i < level; i++)
		{
			lvlUp();
		}
	}

	public void forceAttack(Personnage ennemy)
	{
		ennemy.setHp(ennemy.getHp() - ((this.getForce()/10)*2));
	}

	@Override
	public void armedAttack(Personnage ennemy) {
		System.out.println("I can't use armed Attack !");
		
	}
}
