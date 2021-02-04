package tri;

import java.util.ArrayList;
import java.util.Collections;

public class testVille {

	public static void main(String[] args) {
		ArrayList<Ville> v = new ArrayList<>();
		v.add(new Ville("Nice", 343_000));
		v.add(new Ville("Carcassonne", 47_800));
		v.add(new Ville("Narbonne", 53_400));
		v.add(new Ville("Lyon", 484_000));
		v.add(new Ville("Foix", 9_700));
		v.add(new Ville("Pau", 77_200));
		v.add(new Ville("Marseille", 850_700));
		v.add(new Ville("Tarbes", 40_600));
		v.add(new Ville("Bayonne", 55_000));
		
//		Collections.sort(v);
		Collections.sort(v, new ComparatorNom());
		
		// Boucle objet
		for (Ville ville : v) {
			System.out.println(ville);
		}
		
		System.out.println(v);
		
		
		// Tri basé su l'utilisation du comparator CompparatorHabitant
		Collections.sort(v, new ComparatorHabitant());
		System.out.println(v);
		
		

	}
}
