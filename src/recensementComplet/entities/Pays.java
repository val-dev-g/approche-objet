package recensementComplet.entities;

import java.util.ArrayList;
import java.util.List;

public class Pays extends Lieu {
	
	protected List<Lieu> listeDepartement = new ArrayList();
	protected List<Lieu> listeRegion = new ArrayList();

	public Pays(String code) {
		super(code, code);
	}

	public void addVille(Ville ville) {
		this.population += ville.population;
		this.listeVille.add(ville);
	}

	public void addDepartement(Departement departement) {
		this.listeDepartement.add(departement);

	}

	public void addRegion(Region region) {
		this.listeRegion.add(region);

	}

	public List<Lieu> getListeDepartement() {
		return listeDepartement;
	}

	public List<Lieu> getListeRegion() {
		return listeRegion;
	}
	

}
