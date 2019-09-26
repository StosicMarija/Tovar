package tovar;
//Predmet je tovar zadate vrste i teine
public class Predmet extends Tovar{

	private String vrsta;
	private double tezina;
	
	public Predmet(String vrsta, double tezina) {
		super();
		this.vrsta = vrsta;
		this.tezina = tezina;
	}
	
	public String vrsta() {
		return vrsta;
	}
	public double tezina() {
		return tezina;
	}

}

