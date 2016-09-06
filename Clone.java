public class Clone extends Personnage{

	public Clone() {
		setName("Clone");
		setLvl(1);
		setXp(0);
	    setHp(100);
	    setDef(100);
	    setPower(100);
	    setForce(0);
	    setIntelligence(100);
	}
	
	public Clone(int level) {
		setName("Clone");
		setLvl(1);
		setXp(0);
	    setHp(100);
	    setDef(100);
	    setPower(100);
	    setForce(0);
	    setIntelligence(100);
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
