package recensementComplet.services;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import recensementComplet.entities.Lieu;

public class MenuService {

	protected int choixMenu;
	protected String typeRecherche;
	protected String choix;

	public static String displayMenu(Scanner scanner) {

		System.out.println("\n################# MENU #################\n");

		System.out.println("1. Population d’une ville");
		System.out.println("2. Population d’un département");
		System.out.println("3. Population d’une région");
		System.out.println("4. Liste les 10 régions les plus peuplées");
		System.out.println("5. Liste les 10 départements les plus peuplés");
		System.out.println("6. Liste les 10 villes les plus peuplées d’un département");
		System.out.println("7. Liste les 10 villes les plus peuplées d’une région");
		System.out.println("8. Liste les 10 villes les plus peuplées de France");

		System.out.println("\n9. Quitter");

		return scanner.nextLine();

	}

	protected void displayTop10(List<Lieu> listeLieu) {

		Collections.sort(listeLieu, Collections.reverseOrder());

		for (int i = 0; i <= 9; i++) {
			listeLieu.get(i).information();
		}

	}

	protected boolean verifError(List<Lieu> listeLieu, String code) {

		return listeLieu.stream().anyMatch(lieu -> lieu.getCode().equals(code));
	}

	protected String verifBoolean(List<Lieu> listeLieu, String choix, Scanner scanner) {
		while (!verifError(listeLieu, choix)) {
			System.out.println("La valeur saisie est fausse !");
			System.out.println("1. Saisir de nouveau - 2. Rage quitte");
			Integer newChoose = Integer.parseInt(scanner.nextLine());
			
			while (newChoose < 1 || newChoose > 2) {
				
				System.out.println("La valeur saisie est fausse !");
				System.out.println("1. Saisir de nouveau - 2. Rage quitte");
				newChoose = Integer.parseInt(scanner.nextLine());
			}
			if(newChoose == 2) {
				return "back";
			}
			System.out.println("Merci de saisir un(e) " + typeRecherche);
			choix = scanner.nextLine();
		}
		return choix;
	}
}
