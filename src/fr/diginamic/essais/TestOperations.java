package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
	
	public static void main(String[] args) {
		double x = 50;
		double y = 75;
		double result = Operations.calcul(x, y, '+');
		System.out.println("resultat " + result);
		
		double result2 = Operations.calcul(x, y, '-');
		System.out.println("resultat " + result2);
		
		double result3 = Operations.calcul(x, y, '/');
		System.out.println("resultat " + result3);
	}

}
