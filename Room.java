import java.util.ArrayList;

public class Room {
	private int lvl;
	public ArrayList<Personnage> Remarquezoom = new ArrayList<Personnage>();
	Factory fact = Factory.getInstance();

	public Room() {
		setLvl(1);
		Remarquezoom.add(fact.createEnnemy(1));
	}
	public Room(int level) 
	{
		setLvl(level);
		Personnage unit = fact.createEnnemy(level);
		Remarquezoom.add(unit);
	}
	
	public void populateRoom()
	{
		for (int i = 0; i < 5; i++)
		{
			Remarquezoom.add(fact.createEnnemy(lvl));
		}
	}
	public void levelUp()
	{
		setLvl(getLvl() + 1);
		Remarquezoom.clear();
		Personnage unit = fact.createEnnemy(getLvl());
		Remarquezoom.add(unit);
		
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	
}
