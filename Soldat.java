
public class Soldat extends Personnage {

	public Soldat() {
		setName("Soldat");
		setLvl(1);
		setXp(0);
	    setHp(100);
	    setDef(150);
	    setPower(125);
	    setForce(0);
	    setIntelligence(125);
	}
	
	public Soldat(String name) {
		setName("Soldat");
		setLvl(1);
		setName(name);
		setXp(0);
	    setHp(100);
	    setDef(150);
	    setPower(125);
	    setForce(0);
	    setIntelligence(125);
	}
	
	public Soldat(int level) {
		setName("Soldat");
		setLvl(1);
		setXp(0);
	    setHp(100);
	    setDef(150);
	    setPower(125);
	    setForce(0);
	    setIntelligence(125);
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
