
public class Credit extends Operation {

	public Credit(String d, double m) {
		super(d, m);

	}

	@Override
	public String afficherType() {
		return "Crédit";
	}

}
