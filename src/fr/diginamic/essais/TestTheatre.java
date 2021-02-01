package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre t = new Theatre("toto", 50, 42, 7500);

		t.inscrire(2, 150);
		System.out.println("Nombre de place dispo : " + (t.getCapacite() - t.getClientsInscrits()));
		t.inscrire(10, 150);
		
		System.out.println("Total de clients inscrits : " + t.getClientsInscrits());
		
		System.out.println("Recette : " + t.getRecette() + " €");
	}
}
