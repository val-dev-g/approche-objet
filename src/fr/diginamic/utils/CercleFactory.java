package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	public static Cercle createCercle(double r) {

		Cercle factory = new Cercle(r);

		return factory;
	}

}
