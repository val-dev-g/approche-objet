
public class Cercle implements ObjetGeometrique {
	
	private double r = 0;
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Cercle(double rayon) {
		r = rayon;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2*r *Math.PI;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

}
