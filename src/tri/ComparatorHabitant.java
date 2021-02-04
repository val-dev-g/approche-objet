package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville>{

	@Override
	public int compare(Ville v1, Ville autre) {
		if ( v1.getNbHabitants() > autre.getNbHabitants()){
			return 1;
			}
		if(v1.getNbHabitants() < autre.getNbHabitants()){
			return -1;
			}
		return 0;
	}
	
}
