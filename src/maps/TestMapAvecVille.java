package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMapAvecVille {

	public static void main(String[] args) {
		
		Map<String, Ville> mapVilles = new HashMap<>();
		mapVilles.put("Nice",new Ville("Nice", 343_000));
		mapVilles.put("Carcassonne", new Ville("Carcassonne", 47_800));
		mapVilles.put("Narbonne", new Ville("Narbonne", 53_400));
		mapVilles.put("Lyon", new Ville("Lyon", 484_000));
		mapVilles.put("Foix", new Ville("Foix", 9_700));
		mapVilles.put("Pau", new Ville("Pau", 77_200));
		mapVilles.put("Marseille", new Ville("Marseille", 850_700));
		mapVilles.put("Tarbes", new Ville("Tarbes", 40_600));
		mapVilles.put("Bayonne", new Ville("Bayonne", 55_000));
		
		
		int min = Integer.MAX_VALUE;
		String cleRemove = null;
		
		Iterator<String> iterCles = mapVilles.keySet().iterator();
		while (iterCles.hasNext()) {
			
			String cle = iterCles.next();
			Ville ville = mapVilles.get(cle);
			
			if(ville.getNbHabitants() < min ) {
				min = ville.getNbHabitants();
				cleRemove = cle;
			}
		}
		mapVilles.remove(cleRemove);
		
		// Afficher res final
		for(Ville v : mapVilles.values()) {
			System.out.println(v);
		}
		
	}

}