package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
			// importo lo scanner per chiedere input all'utente
			Scanner scan = new Scanner(System.in);
			
			// creo l'array vuoto per gli studenti
			Studente[] studenti = new Studente[5];
	
			// inizializzo una variabile per calcolare il totale degli studenti promossi
			int studentiPromossi = 0;
			
			// imposto il ciclo for per la valutazione degli studenti
			for (int i=1; i<studenti.length; i++) {
				System.out.println("Id studente: " + i); 
				System.out.println("Inserisci la percentuale delle assenze: ");
				int percentualeAssenze = scan.nextInt();
				System.out.println("Inserisci la media dei voti: ");
				int mediaVoti = scan.nextInt();
				
				studenti[i] = new Studente (i+1, percentualeAssenze, mediaVoti);
				
			// stampo a video la valutazione finale 
				if (studenti[i].promosso()) {
					System.out.println("Promosso");
					studentiPromossi++;
				} else {
					System.out.println("Bocciato");
				}
			}
			
			// restituisco il totale degli alunni promossi
			System.out.println("Gli alunni promossi sono in totale: " + studentiPromossi);
			scan.close();
	}

}
