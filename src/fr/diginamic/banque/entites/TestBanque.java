package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Compte c = new Compte(125.0, "A0010");
//		System.out.println(c);

		CompteTaux t = new CompteTaux(666.0, "V0033", 12.0f);
//		System.out.println(t);

		Compte[] tab = { c, t };
		for (int i = 0; i < tab.length; i++) {
			
			System.out.println(tab[i]);
		}
	}
}