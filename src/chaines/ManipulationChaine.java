package chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
	public static void main(String[] args) {

		String chaine = "Durand;Marcel;2 523.5";

		char premierCaractere = chaine.charAt(0);


		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("La taille du string est :  " + chaine.length());
		System.out.println("index of :  " + chaine.indexOf(';'));
		System.out.println("substring :  " + chaine.substring(0, chaine.indexOf(';') ));
		System.out.println(chaine.substring(0, chaine.indexOf(';')).toUpperCase()); 
		System.out.println(chaine.substring(0, chaine.indexOf(';')).toLowerCase());
		
		
		String[] arrOfStr = chaine.split(";");
        for (String a : arrOfStr) 
            System.out.println(a);
        
        Salarie s = new Salarie(
        		arrOfStr[0],
        		arrOfStr[1],
        		Double.parseDouble(arrOfStr[2].replace(" ", ""))
        		);
        
        System.out.println(s.toString());
	}

}