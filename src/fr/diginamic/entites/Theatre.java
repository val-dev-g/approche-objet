package fr.diginamic.entites;

public class Theatre {

	private String nom;
	private double capacite;
	private double clientsInscrits;
	private double recette;
	
	public Theatre(String nom, double capacite, double clientsInscrits, double recette) {
		this.nom = nom;
		this.capacite = capacite;
		this.clientsInscrits = clientsInscrits;
		this.recette = recette;
	}

	public void inscrire(int nb, double prix) {
		if (nb < (capacite - clientsInscrits)) {
			clientsInscrits += nb;
			recette += prix * nb;
		} else {
			System.out.println("Error la capcité est full");
		}
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getCapacite() {
		return capacite;
	}

	public void setCapacite(double capacite) {
		this.capacite = capacite;
	}

	public double getClientsInscrits() {
		return clientsInscrits;
	}

	public void setClientsInscrits(double clientsInscrits) {
		this.clientsInscrits = clientsInscrits;
	}

	public double getRecette() {
		return recette;
	}

	public void setRecette(double recette) {
		this.recette = recette;
	}
	
	

}
