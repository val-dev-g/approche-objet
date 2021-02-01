package fr.diginamic.operations;

public class CalculMoyenne {

	double[] tab = new double[3];
	int index =0;

	public void ajout( double x) {
		
		if ( index == tab.length -1) {
			double[] tab2 = new double[tab.length+1]; //créer new tab pour ajouter l'ajout de nouveau nombre
			for(int i = 0; i<tab.length; i++) {
				tab2[i] = tab[i];
			}
			tab = tab2;
		}
		
		tab[index] = x;
		index++;
	}

	public double moyenne() {

		double somme = 0;

		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		double moyenne = somme / index ; // (tab.length -1)

		return moyenne;
	}
	
	public void afficheTableau() {
		for(int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

}
