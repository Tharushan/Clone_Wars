import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class GameFunctions {
	
	public static void getStats(Personnage character)
	{
		System.out.println("Name : " + character.getName());
		System.out.println("Level : " + character.getLvl());
		System.out.println("HP : " + character.getHp());
		System.out.println("Def : " + character.getDef());
		System.out.println("Power : " + character.getPower());
		System.out.println("Force : " + character.getForce());
		System.out.println("Intelligence : " + character.getIntelligence());
	}
	
	public static Personnage nextRoom(Room room, Personnage enemy)
	{
		room.levelUp();
		System.out.println("Vous êtes entrés dans la chambre niveau " + room.getLvl());
		enemy = room.Remarquezoom.get(0);
		System.out.println("Un " + enemy.getName() + " de niveau " + enemy.getLvl() + " vous attaque !");
		return enemy;
	}
	
	
	public static void inventoryUse(Personnage mainCharacter)
	{
		Scanner readline = new Scanner(System.in); 
		System.out.println("Quel objet souhaitez vous utiliser ?");
		int inventorySize = mainCharacter.inventory.size();
		Iterator<Item> inventory = mainCharacter.inventory.iterator();
		if (inventorySize == 0)
			System.out.println("Votre inventaire est vide.");
		else
		{
			while (true)
			{
				if (inventorySize == 0){
					System.out.println("Votre inventaire est vide.");
					break;
				}
				int itemcount = 0;
				System.out.println("0) Quit");
				while(inventory.hasNext())
				{
					itemcount +=1;
					Item item = inventory.next();
					System.out.println(itemcount + ")" + item.getName() + " - " + item.getDescription());
				}
				inventory = mainCharacter.inventory.iterator();
				try {
				int itemCmd = readline.nextInt();
				if(itemCmd == 0)
					break;
				else if ( itemCmd > 0 && itemCmd <= itemcount )
				{
					Item itemused = mainCharacter.inventory.get(itemCmd - 1);
					itemused.use(mainCharacter);
					mainCharacter.inventory.remove(itemused);
					break;
				}
				}
				catch (InputMismatchException e)
				{
					System.out.println("Commande incorrecte il faut choisir un numéro d'item.");
					break;
				}
			}
		}
	}
	
	public static void launchGame(Personnage mainCharacter)
	{
		Scanner readline = new Scanner(System.in);
		Room chambre = new Room();
		System.out.println("Vous êtes entrés dans la chambre de niveau " + chambre.getLvl());
		Personnage enemy = chambre.Remarquezoom.get(0);
		System.out.println("Un " + enemy.getName() + " de niveau " + enemy.getLvl() + " vous attaque !");	
		String cmd = "";
		while(mainCharacter.getHp() > 0)
		{
			System.out.println("Que souhaitez vous faire ? ");
			System.out.println("Commandes disponibles : \n-armedattack  -physicalattack\n-forceattack  -Nextroom \n-Enemystats  -stats\n-Inventory  -Exit");
			cmd = readline.nextLine();
			enemy = Commandes.gameAction(chambre, mainCharacter, enemy, cmd);
			if (enemy.getHp() <= 0)
			{
				System.out.println(enemy.getName() + " est mort !");
				chambre.Remarquezoom.remove(enemy);
				Battle.dropItem(mainCharacter, enemy);		
				Battle.winExp(chambre, mainCharacter);
				if(chambre.Remarquezoom.iterator().hasNext() && chambre.Remarquezoom.iterator().next().getHp() > 0)
				{
					enemy = chambre.Remarquezoom.iterator().next();
					System.out.println("\nUn " + enemy.getName() + " de niveau " + enemy.getLvl() + " vous attaque !");
				}
				else if (!chambre.Remarquezoom.iterator().hasNext())
				{
					chambre.populateRoom();
					enemy = chambre.Remarquezoom.iterator().next();
					System.out.println("\nUn " + enemy.getName() + " de niveau " + enemy.getLvl() + " vous attaque !");
				}
			}
		}
		System.out.println("Game over ! Vous êtes mort..");
		readline.close();
	}
	
}
