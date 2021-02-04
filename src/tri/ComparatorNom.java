package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville autre) {

		return v1.getNom().compareTo(autre.getNom());
	}
		
}
