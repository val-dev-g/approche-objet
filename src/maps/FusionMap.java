package maps;

import java.util.HashMap;
// import java.util.Map;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

public class FusionMap {

	public static void main(String[] args) {
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

//		Map<Integer, String> fusion = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//						(countInFirstMap, countInSecondMap) -> countInFirstMap + countInSecondMap));
		
		HashMap<Integer, String> fusion = new HashMap<Integer, String>();
			fusion.putAll(map1);
			fusion.putAll(map2);
			
		System.out.println(fusion);
	}

}
