public class TestOperation {

	public static void main(String[] args) {

		Credit c = new Credit("29/01/2021", 555);
		Credit c1 = new Credit("10/01/2021", 155);

		Debit d = new Debit("20/02/2021", -745);
		Debit d1 = new Debit("06/03/2021", -225);

		double somme = 0;

		Operation[] tab = { c, c1, d, d1 };
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i].montant;

			System.out.println(tab[i].date + " " + tab[i].montant + " " + tab[i].afficherType());
		}
		System.out.println(somme);
	}
}
