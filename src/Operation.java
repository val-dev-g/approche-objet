
public abstract class Operation {

	protected String date;
	protected double montant;

	public Operation(String d, double m) {
		
		this.date = d;
		this.montant = m;

	};
	public abstract String afficherType();
	

}
