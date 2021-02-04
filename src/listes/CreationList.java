package listes;

import java.util.ArrayList;

public class CreationList {
	public static void main(String[] args) {
		ArrayList<Integer> nb = new ArrayList<Integer>();
		
		for (int i = 1; i <= 100; i++) {		
			
		nb.add(i);

		}
		System.out.println(nb);
	}
}