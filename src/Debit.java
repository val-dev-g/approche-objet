
public class Debit extends Operation {

	public Debit(String d, double m) {
		super(d, m);

	}

	@Override
	public String afficherType() {
		return "Débit";
	}

	
}
