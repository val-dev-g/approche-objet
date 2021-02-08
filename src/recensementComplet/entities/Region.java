package recensementComplet.entities;

import java.util.ArrayList;
import java.util.List;

public class Region extends Lieu {

	protected List<Lieu> listeDepartement = new ArrayList();
	protected Pays pays;
	
	public Region(String nom, String code, Pays pays) {
		super(nom, code);
		this.pays = pays;
		this.pays.addRegion(this);
	}

	public void addVille(Ville ville) {
		this.population += ville.population;
		this.listeVille.add(ville);
	}

	public void addDepartement(Departement departement) {
		this.listeDepartement.add(departement);

	}

}