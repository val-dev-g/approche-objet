package maps;

/**
 * @author RichardBONNAMY
 *
 */
public class Ville implements Comparable<Ville> {

	/** nom */
	private String nom;
	
	/** nbHabitants */
	private int nbHabitants;
	

	/** Constructeur
	 * @param nom
	 * @param nbHabitants
	 */
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	@Override
	public int compareTo(Ville autre) {
		return this.nom.compareTo(autre.getNom());
	}
	
	
	@Override
	public String toString() {
		return "nom=" + nom + " - nbHabitants=" + nbHabitants;
	}
	
	
	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}
	/** Setter
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}