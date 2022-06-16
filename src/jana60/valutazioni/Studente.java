package jana60.valutazioni;

public class Studente {

	// Definisco gli attributi della classe
	int idStudente;
	int percentualeAssenze;
	double mediaVoti;
	
	// Costruttori 
	public Studente(int idStudente, int percentualeAssenze, double mediaVoti) {
		super();
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}
	
	// Metodi 
	boolean promosso() {
		boolean promosso;
		if (percentualeAssenze>50) { // se lo studente ha fatto più del 50% di assenze
			promosso = false;
		} else if (percentualeAssenze <= 50 && percentualeAssenze >=25) { // se ha fatto tra il 25% e il 50% di assenze
			promosso = mediaVoti >2;
		} else if (percentualeAssenze < 25) { // se ha fatto meno del 25% di assenze
			promosso = mediaVoti >= 2;
		} else {
			promosso = false;
		} return promosso;
	}
}
