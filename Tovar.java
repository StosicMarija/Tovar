package tovar;
//Apstraktnom tovaru mo�e da se dohvati naziv vrste, odredi te�ina i sastaiv tekstualni opis u obliku: vrsta(tezina)
public abstract class Tovar {
	
public abstract String vrsta();
	
	public abstract double tezina();
	
	public String toString() {
		String s = "";
		s +="\t"+ vrsta() + "(" + tezina() + ")";
		return s;
	}
}
