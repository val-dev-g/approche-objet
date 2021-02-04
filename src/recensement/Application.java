package recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:\\Users\\PC VALENTIN\\Desktop\\Diginamic\\recensement.csv");
		List<String> lignes = Files.readAllLines(path);

		List<Ville> listeville = new ArrayList<>();

		for (int i = 1; i < lignes.size(); i++) {

			String ligne = lignes.get(i);
			String[] morceaux = ligne.split(";");
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDept = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			int populationTotale = Integer.parseInt(morceaux[9].replaceAll(" ", ""));

			Ville ville = new Ville(codeRegion, nomRegion, codeDept, codeCommune, nomCommune, populationTotale);

			listeville.add(ville);
		}

		int total34 = 0;
		int popMin = Integer.MAX_VALUE;
		Ville villePopMin = null;

		for (Ville v : listeville) {
			if (v.getNomCommune().equals("Montpellier")) {
				System.out.println(v);
			}
			if (v.getCodeDept().equals("34")) {
				total34 += v.getPopulationTotale();
				if (v.getPopulationTotale() < popMin) {
					popMin = v.getPopulationTotale();
					villePopMin = v;
				}
			}

		}

		System.out.println("population du dept 34 : " + total34);
		System.out.println("Ville la moins peuplée : " + villePopMin);
	}

}