package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		// Affichage des 4 saisons
		System.out.println("Partie 1: affichage des 4 saisons:");
		
		for (Saison saison: Saison.values()) {
			System.out.println(saison);
		}
		
		System.out.println("--------------------------------------");
		
		// Recherche d'une saison à partir de son nom (nom de l'instance)
		
		System.out.println("Partie 2: Recherche de la saison dont le nom est ETE:");
		
		String nom = "ETE";
		Saison ete = Saison.valueOf(nom);
		System.out.println(ete);
		
		System.out.println("--------------------------------------");
		
		// Recherche d'une saison à partir de son libellé (attribut d'instance)
		// Il est nécessaire de développer une méthode static dans Saison
		
		System.out.println("Partie 3: Recherche de la saison dont le libellé est Hiver:");
		
		String libelle = "Hiver";
		Saison hiver = Saison.getByLibelle(libelle);
		System.out.println(hiver);
		
		System.out.println("--------------------------------------");
	}

}