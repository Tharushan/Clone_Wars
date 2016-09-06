
public class Jawa extends Personnage{

	public Jawa() {
		setLvl(1);
	    setXp(0);
	    setHp(400);
	    setDef(400);
	    setPower(400);
	    setForce(0);
	    setIntelligence(400);
	}
	
	public Jawa(String name) {
		setLvl(1);
		setName(name);
	    setXp(0);
	    setHp(400);
	    setDef(400);
	    setPower(400);
	    setForce(0);
	    setIntelligence(400);
	}
	
	public Jawa(int level) {
		setLvl(1);
	    setXp(0);
	    setHp(400);
	    setDef(400);
	    setPower(400);
	    setForce(0);
	    setIntelligence(400);
	    for (int i = getLvl(); i < level; i++)
		{
			lvlUp();
		}
	}

	public void armedAttack(Personnage ennemy)
	{
		int damage = ((this.getIntelligence() - ennemy.getDef()) > 0) ? (this.getIntelligence() - ennemy.getDef()) : 10;
		ennemy.setHp(ennemy.getHp() - damage);
	}

	@Override
	public void forceAttack(Personnage ennemy) {
		System.out.println("I can't use a force attack !");	
	}
}
