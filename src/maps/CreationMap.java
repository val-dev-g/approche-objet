package maps;

import java.util.HashMap;

public class CreationMap {
	
	public static void main(String[] args) {
        HashMap<String, Integer> mapSalaires = new HashMap<>();
        mapSalaires.put("Paul", 1750);
        mapSalaires.put("Hicham", 1825);
        mapSalaires.put("Yu", 2250);
        mapSalaires.put("Ingrid", 2015);
        mapSalaires.put("Chnatal", 2418);
      
		// Afficher la taille
        System.out.println("Taille : " + mapSalaires.size());
        
    }
}