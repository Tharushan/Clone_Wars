
public class Jedi extends Personnage {

	//private static Jedi instance = new Jedi();
	public Jedi() {
		setLvl(1);
	    setXp(0);
	    setHp(100);
	    setDef(200);
	    setPower(100);
	    setForce(200);
	    setIntelligence(200);
	}
	
	public Jedi(String name) {
		setLvl(1);
		setName(name);
	    setXp(0);
	    setHp(100);
	    setDef(200);
	    setPower(100);
	    setForce(200);
	    setIntelligence(200);
	}
	
	public Jedi(int level) {
		setLvl(1);
	    setXp(0);
	    setHp(100);
	    setDef(200);
	    setPower(100);
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
	
	
//	public static Jedi getInstance(){
//		return instance;
//	}
	
}
