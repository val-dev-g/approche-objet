package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		Cercle cercle = new Cercle(5.66);
		double s = cercle.surf();

		System.out.println("surface :" + s + " - perimetre : " + cercle.peri());

		Cercle cercle2 = CercleFactory.createCercle(20); // A expliquer
		
		System.out.println("surface :" + cercle2.surf() + " - perimetre : " + cercle2.peri());

	}
}