package recensementIntro;

public class TestEqual {

	public static void main(String[] args) {

		Ville v1 = new Ville("1", "Bretagne", "29", "29450", "Brest", 59000);
		Ville v2 = new Ville("1", "Bretagne", "29", "29450", "Brest", 59000);

		boolean egalite = v1.equals(v2);
		System.out.println(egalite);

	}

}
