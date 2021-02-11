package fr.diginamic.testexceptions;

import tri.Ville;

public class TestReflectionUtils {

	public static void main(String[] args) {
		
		Ville v = new Ville("Montpellier", 200_000);

		try {
			ReflectionUtils.afficherAttributs(null);
		
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}