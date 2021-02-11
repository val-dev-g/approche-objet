package fr.diginamic.testenumeration;

/** Fournit les 4 saisons
 * @author RichardBONNAMY
 *
 */
public enum Saison {
	
	/** PRINTEMPS */
	PRINTEMPS("Printemps", 1), 
	/** ETE */
	ETE("Eté", 2), 
	/** AUTOMNE */
	AUTOMNE("Automne", 3), 
	/** HIVER */
	HIVER("Hiver", 4);

	/** libelle */
	private String libelle;
	
	/** ordre */
	private int ordre;
	
	/** Constructeur
	 * @param libelle libellé de la saison
	 * @param ordre ordre de la saison dans l'année
	 */
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}
	
	/** Recherche d'une saison par libellé
	 * @param libelle libellé de la saison
	 */
	public static Saison getByLibelle(String libelle) {
		for (Saison saison: values()) {
			if (saison.getLibelle().equals(libelle)) {
				return saison;
			}
		}
		return null;
	}
	
	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/** Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/** Getter
	 * @return the ordre
	 */
	public int getOrdre() {
		return ordre;
	}
	/** Setter
	 * @param ordre the ordre to set
	 */
	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	
}