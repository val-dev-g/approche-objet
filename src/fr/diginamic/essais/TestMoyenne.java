package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne m = new CalculMoyenne();

		m.ajout(10);  // Appel de la m�thode
		m.ajout(50);
		m.ajout(15);
		m.ajout(8);
		
		m.afficheTableau();
		m.moyenne();
		
		System.out.println("la moyenne est �gal � : " + m.moyenne());
	}

}
