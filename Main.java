import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("========== Clone Wars =========");
		Scanner readline = new Scanner(System.in);
		String characterName = "";
		System.out.print("Nom du personnage: ");
		characterName = readline.nextLine();	
		Personnage mainCharacter = null;
		System.out.println("Hey "+ characterName + " ! Nous avons besoin de ton aide !");
		mainCharacter = Commandes.chooseCharacter(mainCharacter, readline, characterName);
		System.out.println("Tu es donc un "+ mainCharacter.getClass().getName() + " !");
		
		System.out.println("Grimpe la tour afin de pouvoir vaincre le boss ! Tu devras commencer de la chambre 1");
		System.out.println("Et ensuite t'entra�ner afin de pouvoir entrer dans la suivante afin de grimper la tour et ensuite d�livrer la princesse Chewbacca\n");
		GameFunctions.launchGame(mainCharacter);
	}

}
