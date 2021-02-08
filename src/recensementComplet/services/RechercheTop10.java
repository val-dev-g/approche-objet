package recensementComplet.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import recensementComplet.Recensement;
import recensementComplet.entities.Lieu;

public class RechercheTop10 extends MenuService {

	public RechercheTop10(int choixMenu, String typeRecherche) {
		this.choixMenu = choixMenu;
		this.typeRecherche = typeRecherche;

	}

	public void traiter(Scanner scanner, Recensement recensement) {

		List<Lieu> choixListe = new ArrayList<>();

		if (choixMenu == 4 || choixMenu == 5 || choixMenu == 8) {

			if (choixMenu == 4) {
				choixListe = recensement.getPays().getListeRegion();

			} else if (choixMenu == 5) {
				choixListe = recensement.getPays().getListeDepartement();

			} else {
				choixListe = recensement.getPays().getListeVille();

			}
		} else {

			List<Lieu> choixAdd = new ArrayList<>();

			if (choixMenu == 6) {

				choixAdd = recensement.getPays().getListeDepartement();
				System.out.println("Merci de saisir un departement ");
				this.choix = scanner.nextLine();

			} else {

				choixAdd = recensement.getPays().getListeRegion();
				System.out.println("Merci de saisir une région ");
				this.choix = scanner.nextLine();

			}
			
			choix = verifBoolean(choixAdd, choix, scanner);
			
			if(choix == "back") {
				return;
			}
			
			for (Lieu l : choixAdd) {
				if (choix.equals(l.getCode())) {
					choixListe = l.getListeVille();
					System.out.println("Top 10 des villes pour le/l " + typeRecherche + " " + l.getNom());
				}
			}
			
		}
		this.displayTop10(choixListe);
		System.out.println("Appuyer sur une touche pour continuer ");
		scanner.nextLine();
		return;
	}
}