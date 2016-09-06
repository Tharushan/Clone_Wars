
public class Droid extends Personnage{

	public Droid() {
		setLvl(1);
		setXp(0);
	    setHp(50);
	    setDef(100);
	    setPower(25);
	    setForce(0);
	    setIntelligence(200);
	    setName("Droid");
	}
	
	public Droid(int level) {
		setName("Droid");
		setLvl(1);
		setXp(0);
	    setHp(50);
	    setDef(100);
	    setPower(25);
	    setForce(0);
	    setIntelligence(200);
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
