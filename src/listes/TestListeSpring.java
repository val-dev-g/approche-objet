package listes;

import java.util.ArrayList;

public class TestListeSpring {

	public static void main(String[] args) {

		ArrayList<String> ville = new ArrayList<String>();

		ville.add("Nice");
		ville.add("Carcassonne");
		ville.add("Narbonne");
		ville.add("Lyon");
		ville.add("Foix");
		ville.add("Pau");
		ville.add("Marsaille");
		ville.add("Tarbes");

		int max = 0;
		
		for (int i = 0; i < ville.length(); i++ ) {
			if (ville.length() > max) {
				max = ville.length();
			}
		}

	}
}