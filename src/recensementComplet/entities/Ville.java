package recensementComplet.entities;

public class Ville extends Lieu {
	
	protected Departement departement;
	protected Region region;
	protected Pays pays;
	
	public Ville(String nom, String code, Departement departement, Region region, int population, Pays pays) {
		super(nom, code);
		this.population = population;
		this.departement = departement;
		this.region = region;
		this.pays = pays;
		this.region.addVille(this);
		this.pays.addVille(this);
		this.departement.addVille(this);
	}
}
