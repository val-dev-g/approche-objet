package recensementComplet.entities;

public class Departement extends Lieu {
	
	protected Region region;
	protected Pays pays;
	
	public Departement(String nom, String code, Region region, Pays pays) {
		super(nom, code);
		this.region = region;
		this.pays = pays;
		this.pays.addDepartement(this);
	}
	
	public void addVille(Ville ville) {
		this.population += ville.population;
		this.listeVille.add(ville);
	}
}
