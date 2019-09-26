package tovar;
//Kamion ima zadat registarski broj tipa String i može da bude natovaren tovarom do zadate ukupne težine (nosivosti). 
//Stvara se prazan. Može da se stavi neki tovar na kraj tovarne liste, da se skine tovar sa kraja tovarne liste. 
//Povratna vrednost pri stavljanju je indikator uspeha. 
//Može da se sa sastavi tekstualni opis kamion u obliku: 
//regBroj(teret/nosivost)\n (Tovar)\n (Tovar)... gde (Tovar) predstavlja ispis jednog tovara iz liste

import java.util.LinkedList;


public class Kamion {
	private String regBr;
	private LinkedList<Tovar>tovar;
	private double nosivost;
	private double teret;
	
	public Kamion(String regBr,double nosivost) {
		super();
		this.regBr = regBr;
		this.nosivost = nosivost;
		tovar= new LinkedList<Tovar>();
		teret=0;
	}

	public boolean stavi (Tovar t) {
	if (teret+t.tezina()>=nosivost) 
		return false;
	
	tovar.add(t);
	teret+=t.tezina();
			return true;
	}
	public boolean skini () {
		if (tovar.size()==0)
			return false;
		else 
			this.tovar.remove(tovar.size()-1);
		return true;
	}
	
		public String toString() {
	        String s = "";
	        s += regBr + " (" + teret + "/" + nosivost + ")";
	        for (Tovar t : tovar) {
				s += "\n" + t;
			}
			
			return s;
		}
		}
