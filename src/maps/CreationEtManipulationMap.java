package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreationEtManipulationMap {
	public static void main(String args[]) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		Iterator<Integer> keysIte = mapVilles.keySet().iterator();

		while (keysIte.hasNext()) {
			Integer key = keysIte.next();
			System.out.println(key);
		}

		Iterator<String> villes = mapVilles.values().iterator();

		while (villes.hasNext()) {
			String key = villes.next();
			System.out.println(key);
		}
		System.out.println(mapVilles.size());
		

	}

}