package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double taux;

	public CompteTaux(double solde, String numeroCompte, double taux) {
		super(solde, numeroCompte);
		this.taux = taux;
	}

	@Override
	public String toString() {
		String compte = super.toString();
		return compte + " - Taux : " + taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

}
