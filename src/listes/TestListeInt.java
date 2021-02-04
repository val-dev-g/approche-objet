package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
	public static void main(String[] args) {

		ArrayList<Integer> liste = new ArrayList<Integer>();

		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		liste.add(-18);
		liste.add(-3);

//		System.out.println(liste);
//		System.out.println(liste.size());
//
//		Object min = Collections.min(liste);
//		System.out.println(min);
//		
//		Object max = Collections.max(liste);
//		System.out.println(max);

		liste.remove(Collections.min(liste));
		System.out.println("Supprime le plus petit élément de la liste : ");
//		for (Integer e : liste)
//			System.out.println(e);

		for (int i = 0; i < liste.size(); i++) {
			int nb = liste.get(i);
			if( nb < 0 ) {
				System.out.println(nb);
				liste.set(i, - nb);

			}
		}
		System.out.println(liste);
	}
}
