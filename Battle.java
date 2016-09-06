
public class Battle {

	public static void dropItem(Personnage mainCharacter, Personnage enemy)
	{
		int randNbr = 0 + (int)(Math.random() * ((100 - 0) + 1));
		if (randNbr >= 90)
		{
			mainCharacter.inventory.add(new Potion(enemy.getLvl()));
			System.out.println("Vous avez drop 1 potion ! " );
		}	
	}
	
	public static void winExp(Room chambre,Personnage mainCharacter){
		int actualXP = mainCharacter.getXp();
		int gainedXP; 
		if(mainCharacter.getLvl() <= 5){
			 mainCharacter.setXp(mainCharacter.getXp()+10);
		}

		if (chambre.getLvl() > mainCharacter.getLvl()){
			mainCharacter.setXp(mainCharacter.getXp() +20);
		}
		else if (chambre.getLvl()<= mainCharacter.getLvl()){
			mainCharacter.setXp(mainCharacter.getXp() +10);
		}

		if(mainCharacter.getXp() >= 100){
			mainCharacter.lvlUp();
			System.out.println("Vous êtes monté au niveau " + mainCharacter.getLvl());
			mainCharacter.setXp(mainCharacter.getXp() - 100);
		}
		gainedXP = ((mainCharacter.getXp() - actualXP) > 0) ? mainCharacter.getXp() - actualXP : 100 + (mainCharacter.getXp() - actualXP);
		String xpString = "Vous avez gagné " + gainedXP + " XP";
		xpString += ", vous êtes maintenant à " + mainCharacter.getXp() + "% du niveau" + (mainCharacter.getLvl() + 1);
		System.out.println(xpString);
	}
	
	public static void attack(Personnage character, Personnage enemy, String attack)
	{
		if (attack == "armedAttack")
		{
			System.out.println(character.getName()+ " a attaqué " + enemy.getClass().getName() + " avec armed Attack");
			character.armedAttack(enemy);
		}
		else if(attack == "physicalAttack")
		{
			System.out.println(character.getName()+ " a attaqué " + enemy.getClass().getName()+ " avec physical Attack");
			character.physicalAttack(enemy);		
		}
		else if(attack == "forceAttack")
		{
			System.out.println(character.getName()+ " a attaqué " + enemy.getClass().getName()+ " avec force Attack");
			character.forceAttack(enemy);
		}
		if (enemy.getHp() > 0)
		{
			System.out.println(enemy.getClass().getName() + " ennemi a maintenant " + enemy.getHp() + " HP");
			int randattack = (int)(Math.random() * 2);
			if (randattack == 0)
			{
				enemy.armedAttack(character);
				System.out.println(enemy.getName()+ " a attaqué " + character.getName() + " avec armed Attack");	
				System.out.println(character.getName() + " a maintenant " + character.getHp() + " HP");
			}
		else
		{
			enemy.physicalAttack(character);
			System.out.println(enemy.getName()+ " a attaqué " + character.getName() + " avec physical Attack");
			System.out.println(character.getName() + " a maintenant " + character.getHp() + " HP");
		}
		}
	}
	
}
