public class Factory {

	private int Ennemylvl(int level)
	{
		return (level + (int)(Math.random() * (((level + 2) - level) + 1)));
	}
	private static Factory instance = new Factory();

	private Factory (){

	}

	public Personnage createEnnemy(int level)
	{
		Personnage ennemy;
		int randNbr = 0 + (int)(Math.random() * ((100 - 0) + 1));
		if (randNbr >= 0 && randNbr <= 45)
			ennemy = new Clone(Ennemylvl(level));
		else if (randNbr > 50 && randNbr <= 80)
			ennemy = new Soldat(Ennemylvl(level));
		else
			ennemy = new Droid(Ennemylvl(level));
		return ennemy;

	}

	public static Factory getInstance(){
		return instance;
	}

}
