package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

//
//		Personne a1 = new Personne();
//		a1.nom = "GUERARD";
//		a1.prenom = "Valentin";
//		a1.adressePostale = p1;
//
//		AdressePostale p2 = new AdressePostale();
//		p2.numeroRue = 15;
//		p2.libelleVoie = "Maréchal";
//		p2.codePostal = 78000;
//		p2.ville = "Versailles";
//
//		Personne a2 = new Personne();
//		a2.nom = "Glauz";
//		a2.prenom = "Midora";
//		a2.adressePostale = p1;
		
		AdressePostale test = new AdressePostale(10, "Fosh", 78000, "Versailles" );
		Personne me = new Personne("Valentin", "GUERARD", test);
		System.out.println(me);
	}

}
