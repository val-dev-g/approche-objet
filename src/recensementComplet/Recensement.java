package recensementComplet;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import recensementComplet.entities.Departement;
import recensementComplet.entities.Pays;
import recensementComplet.entities.Region;
import recensementComplet.entities.Ville;

public class Recensement {

	protected Map<String, Region> mapRegion = new HashMap<>();
	protected Map<String, Departement> mapDepartement = new HashMap<>();
	protected Pays france;

	public void rescencerFichier(String cheminFichier) throws IOException {
		Path fichierTraitement = Paths.get(cheminFichier);
		List<String> lignesFichier = Files.readAllLines(fichierTraitement, StandardCharsets.UTF_8);
		

		france = new Pays("France");

		for (String ligne : lignesFichier) {
			String[] colonne = ligne.split(";");

			if (colonne[0].matches("\\d+")) {

				// a partir d'ici on commence le traitement
				int populationTotale = Integer.parseInt(colonne[9].replaceAll(" ", ""));
				String codeRegion = colonne[0];
				String codeDepartement = colonne[2];
				String codeVille = colonne[6];

				String nomRegion = colonne[1];

				if (!mapRegion.containsKey(codeRegion)) {
					Region region = new Region(nomRegion, codeRegion, france);
					mapRegion.put(codeRegion, region);
				}

				if (!mapDepartement.containsKey(codeDepartement)) {
					Departement departement = new Departement(codeDepartement, codeDepartement,
							mapRegion.get(codeRegion), france);
					mapDepartement.put(codeDepartement, departement);
				}

				Ville ville = new Ville(codeVille, codeVille, mapDepartement.get(codeDepartement),
						mapRegion.get(codeRegion), populationTotale, france);

			}

		}
		
	}
	public Pays getPays() {
		return this.france;
	}
}
