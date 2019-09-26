package tovar;
//Paket je tovar koji može da sadrži proizvoljan broj tovara. Stvara se prazan posle čega se tovari dodaju pojedinačno. 

//Naziv vrste je u formatu paket[(Tovar),(Tovar),...] gde (Tovar) predstavlja vrstu jednog tovara iz liste

import java.util.LinkedList;

public class Paket extends Tovar {

	private LinkedList<Predmet> paket;

	public Paket() {
		LinkedList<Predmet> p = new LinkedList<>();
		this.paket = p;
	}

	public void dodaj(Predmet p) {
		this.paket.add(p);

	}
	@Override
	public String vrsta() {
		StringBuilder sb = new StringBuilder();
		sb.append("paket[");
		for(Predmet a: paket) {
			sb.append(a.vrsta()).append(",");
	
			
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
	@Override
	public double tezina() {
		double q = 0;
		for (Predmet a : paket) {
			q += a.tezina();
		}
		return q;
	}
	
}
