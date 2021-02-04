package recensement;

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

	@Override
	public String toString() {
		return nomCommune.toUpperCase() + " (code commune " + codeCommune + ") : région " + nomRegion 
                + " (code " + codeRegion + "), dep = " + codeDept + ", pop = " + populationTotale + " hab\n";
	}

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
