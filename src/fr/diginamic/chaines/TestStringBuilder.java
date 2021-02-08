package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		long debut = System.currentTimeMillis();
		
//	StringBuilder sb = new StringBuilder();
	String chaine = "";
	for (int i=0; i<10000; i++ ) {
//		sb.append(i);
		chaine+=1;
	}
	
//	String chaine = sb.toString();
//	System.out.println(chaine);
		
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

	}

}
