package recensementIntro;

public class Ville {
	private String codeRegion;
	private String nomRegion;
	private String codeDept;
	private String codeCommune;
	private String nomCommune;
	private int populationTotale;
	
	
	public Ville(String codeRegion, String nomRegion, String codeDept, String codeCommune, String nomCommune,
			int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
	
	
	// Equal
	public boolean equals(Object obj) {
		
		//Vérifier que obj est bien une instance de Ville
		if (! (obj instanceof Ville )){ //if (!obj.getClass().getSimpleName()
			return false;
		}
		// A ce niveau on est sûr que obj une ville
		// je peux transformer obj qui est de type Object en Ville
		Ville autre = (Ville)obj;
		boolean egalite = this.nomCommune.equals(autre.getNomCommune()) && this.getPopulationTotale() == autre.getPopulationTotale();
//		return this.nomCommune.equals(autre.getNom()) && this.nbHabitants == autre.getNbHabitants();
		return egalite;
	}
	// Fin Equal

	@Override
	public String toString() {
		return nomCommune.toUpperCase() + " (code commune " + codeCommune + ") : région " + nomRegion 
                + " (code " + codeRegion + "), dep = " + codeDept + ", pop = " + populationTotale + " hab\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeCommune == null) ? 0 : codeCommune.hashCode());
		result = prime * result + ((codeDept == null) ? 0 : codeDept.hashCode());
		result = prime * result + ((codeRegion == null) ? 0 : codeRegion.hashCode());
		result = prime * result + ((nomCommune == null) ? 0 : nomCommune.hashCode());
		result = prime * result + ((nomRegion == null) ? 0 : nomRegion.hashCode());
		result = prime * result + populationTotale;
		return result;
	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Ville other = (Ville) obj;
//		if (codeCommune == null) {
//			if (other.codeCommune != null)
//				return false;
//		} else if (!codeCommune.equals(other.codeCommune))
//			return false;
//		if (codeDept == null) {
//			if (other.codeDept != null)
//				return false;
//		} else if (!codeDept.equals(other.codeDept))
//			return false;
//		if (codeRegion == null) {
//			if (other.codeRegion != null)
//				return false;
//		} else if (!codeRegion.equals(other.codeRegion))
//			return false;
//		if (nomCommune == null) {
//			if (other.nomCommune != null)
//				return false;
//		} else if (!nomCommune.equals(other.nomCommune))
//			return false;
//		if (nomRegion == null) {
//			if (other.nomRegion != null)
//				return false;
//		} else if (!nomRegion.equals(other.nomRegion))
//			return false;
//		if (populationTotale != other.populationTotale)
//			return false;
//		return true;
//	}


	public String getCodeRegion() {
		return codeRegion;
	}


	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}


	public String getNomRegion() {
		return nomRegion;
	}


	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}


	public String getCodeDept() {
		return codeDept;
	}


	public void setCodeDept(String codeDept) {
		this.codeDept = codeDept;
	}


	public String getCodeCommune() {
		return codeCommune;
	}


	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}


	public String getNomCommune() {
		return nomCommune;
	}


	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}


	public int getPopulationTotale() {
		return populationTotale;
	}


	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	
	
	
	
	

}
