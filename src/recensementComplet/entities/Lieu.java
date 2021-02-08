package recensementComplet.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Lieu implements Comparable {

	protected Integer population = 0;
	protected String code;
	protected String nom;
	protected List<Lieu> listeVille = new ArrayList();

	public Lieu(String nom, String code) {
		this.nom = nom;
		this.code = code;
	}

	public void information() {
		System.out.println(this.nom + " -> " + this.population + " habitants ");
	}

	public Integer getPopulation() {
		return population;
	}

	public String getCode() {
		return code;
	}

	public String getNom() {
		return nom;
	}

	public List<Lieu> getListeVille() {
		return listeVille;
	}
	
	public int compareTo(Object o) {
		
		Lieu autreLieu = (Lieu)o;
		return this.getPopulation().compareTo(autreLieu.population);
	}

}
