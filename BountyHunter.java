
public class BountyHunter extends Personnage {

	public BountyHunter() {
	    setLvl(1);
	    setXp(0);
	    setHp(100);
	    setDef(100);
	    setPower(100);
	    setForce(0);
	    setIntelligence(350);
	}
	
	public BountyHunter(String name) {
	    setLvl(1);
	    setName(name);
	    setXp(0);
	    setHp(100);
	    setDef(100);
	    setPower(100);
	    setForce(0);
	    setIntelligence(350);
	}
	
	public BountyHunter(int level) {
	    setLvl(1);
	    setXp(0);
	    setHp(100);
	    setDef(100);
	    setPower(100);
	    setForce(0);
	    setIntelligence(350);
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
