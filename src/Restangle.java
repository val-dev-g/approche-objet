
public class Restangle implements ObjetGeometrique{
	
private double longueur;

private double largeur;

public Restangle(double largeur) {
	this.largeur = largeur;
}

@Override
public double perimetre() {

	return 2.0 * (longueur + largeur);
}

@Override
public double surface() {

	return longueur * largeur;
}

public double getLongueur() {
	return longueur;
}

public void setLongueur(double longueur) {
	this.longueur = longueur;
}

public double getLargeur() {
	return largeur;
}

public void setLargeur(double largeur) {
	this.largeur = largeur;
}

}
