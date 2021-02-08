package recensementComplet.services;

import java.util.List;
import java.util.Scanner;

import recensementComplet.Recensement;
import recensementComplet.entities.Lieu;

public class RecherchePopulation extends MenuService {
	public RecherchePopulation(int choixMenu, String typeRecherche) {
		this.choixMenu = choixMenu;
		this.typeRecherche = typeRecherche;

	}

	public void traiter(Scanner scanner, Recensement recensement) {
		System.out.println("Merci de saisir un(e) " + typeRecherche);
		choix = scanner.nextLine();

		List<Lieu> choixListe;

		if (choixMenu == 1) {
			choixListe = recensement.getPays().getListeVille();

		} else if (choixMenu == 2) {
			choixListe = recensement.getPays().getListeDepartement();

		} else {
			choixListe = recensement.getPays().getListeRegion();

		}

		for (Lieu l : choixListe) {
			if (choix.equals(l.getCode())) {
				l.information();
			}
		}
		System.out.println("Appuyez sur une touche pour continuer");
		scanner.nextLine();
		return;
	}

}
