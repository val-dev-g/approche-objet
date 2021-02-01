package essais;
import entites.*;

public class TestAdressePostale {

	public static void main(String[] args) {
		
//		AdressePostale ap1 = new AdressePostale();
//		ap1.numeroRue = 10;
//		ap1.libelleVoie = "Philibert Delorme";
//		ap1.codePostal = 78280;
//		ap1.ville = "Guyancourt";
//		
//		AdressePostale ap2 = new AdressePostale();
//		ap2.numeroRue = 15;
//		ap2.libelleVoie = "Maréchal";
//		ap2.codePostal = 78000;
//		ap2.ville = "Versailles";
		
		AdressePostale test = new AdressePostale(10, "Fosh", 78000, "Versailles" );
		
		System.out.println(test.ville);
	}

}
