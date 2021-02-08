package recensementComplet;

import java.io.IOException;

import java.util.Scanner;

import recensementComplet.services.MenuService;
import recensementComplet.services.RecherchePopulation;
import recensementComplet.services.RechercheTop10;

public class Application2 {

	public static void main(String[] args) throws IOException {
		Recensement recensement = new Recensement();
		String cheminFichier = "C:\\Users\\PC VALENTIN\\Desktop\\Diginamic\\recensement.csv";
		recensement.rescencerFichier(cheminFichier);
		Scanner sc = new Scanner(System.in);

		int choix = 0;

		while (choix != 9) {

			choix = Integer.parseInt(MenuService.displayMenu(sc));

			if (choix < 1 || choix > 9) {
				System.out.println("Le choix n'est pas correcte");
			} else {
				switch (choix) {
				case 1:
					RecherchePopulation rv = new RecherchePopulation(1, "ville");
					rv.traiter(sc, recensement);
					break;
				case 2:
					RecherchePopulation rd = new RecherchePopulation(2, "département");
					rd.traiter(sc, recensement);
					break;
				case 3:
					RecherchePopulation rr = new RecherchePopulation(3, "region");
					rr.traiter(sc, recensement);
					break;
				case 4:
					RechercheTop10 rr10 = new RechercheTop10(4, "region");
					rr10.traiter(sc, recensement);
					break;
				case 5:
					RechercheTop10 rd10 = new RechercheTop10(5, "département");
					rd10.traiter(sc, recensement);
					break;
				case 6:
					RechercheTop10 rvd10 = new RechercheTop10(6, "département");
					rvd10.traiter(sc, recensement);
					break;
				case 7:
					RechercheTop10 rvr10 = new RechercheTop10(7, "region");
					rvr10.traiter(sc, recensement);
					break;
				case 8:
					RechercheTop10 rvf10 = new RechercheTop10(8, "ville");
					rvf10.traiter(sc, recensement);
					break;
				case 9:
					System.out.println("Fermeture du menu");
					sc.close();
					break;

				}
			}

		}
	}

}
