import java.util.Scanner;

public class Commandes {
	public static Personnage gameAction(Room chambre, Personnage mainCharacter, Personnage enemy, String cmd)
	{
		switch(cmd.toLowerCase())
		{
			case "stats":
				GameFunctions.getStats(mainCharacter);
				break;
			case "enemystats":
				GameFunctions.getStats(enemy);
				break;
			case "armedattack":
				Battle.attack(mainCharacter, enemy, "armedAttack");
				break;
			case "physicalattack":
				Battle.attack(mainCharacter, enemy, "physicalAttack");
				break;
			case "forceattack":
				Battle.attack(mainCharacter, enemy, "forceAttack");
				break;
			case "nextroom":
				enemy = GameFunctions.nextRoom(chambre, enemy);
				break;
			case "inventory":
				GameFunctions.inventoryUse(mainCharacter);
				break;
			case "exit":
				System.out.println("Bye bye loser!");
				System.exit(0);
			default: 
				System.out.println("Mauvaise commande !");
				break;
		}
		return enemy;
	}
	
	public static Personnage chooseCharacter(Personnage mainCharacter, Scanner readline, String characterName)
	{
		String classe = "";
	    boolean chooseChar = false;
		while (!chooseChar)
		{
			System.out.println("Choisissez une classe : \n-Jedi\n-Sith\n-BountyHunter");
			System.out.println("-ImperialAgent\n-Mercenary\n-Jawa");
			classe = readline.nextLine();
			switch (classe.toLowerCase())
			{
				case "jedi" :
					mainCharacter = new Jedi(characterName);
					chooseChar = true;
					break;
				case "sith" :
					mainCharacter = new Sith(characterName);
					chooseChar = true;
					break;
				case "bountyhunter" :
					mainCharacter = new BountyHunter(characterName);
					chooseChar = true;
					break;
				case "imperialagent" :
					mainCharacter = new ImperialAgent(characterName);
					chooseChar = true;
					break;
				case "mercenary":
					mainCharacter = new Mercenary(characterName);
					chooseChar = true;
					break;
				case "jawa":
					mainCharacter = new Jawa(characterName);
					chooseChar = true;
					break;
				default:
					System.out.println("Choisissez une classe dans la liste !");;
			}
		}
		return mainCharacter;
	}
	
}
