package listes;

import java.util.ArrayList;


public class FusionListe {
	public static void main(String args[]) {
		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		ArrayList<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		   liste1.addAll(liste2); 
	        System.out.println(liste1);

	}
}