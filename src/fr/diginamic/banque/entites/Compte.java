package fr.diginamic.banque.entites;

public class Compte {

	private double solde;
	private String numeroCompte;
	
	public Compte(double solde, String numeroCompte) {
		
		this.solde = solde;
		this.numeroCompte = numeroCompte;
	}
	
	public String toString() {
		return numeroCompte +" - solde : " + solde;
	}
	
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}
	/**
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
}