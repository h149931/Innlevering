package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgave3o2 {
	public static void main(String[] args) {
		// N�r tallet er h�yere enn 12 blir svaret feil. Er for h�y verdi for en int til
		// � regne ut. 13+ gir feil svar
		int heltall = Integer.parseInt(showInputDialog("Skriv inn heltall:"));
		long fakultet = 1; //Bruker long istednefor int fordi tallet blir for stort, og dermedfunker ikke int med heltall over 12
		int heltall2 = heltall; // lager en ny variabel slik at jeg kan se om brukerinput er over 12
		int i = 1;
		while (i <= heltall) {
			fakultet = fakultet * i;
			i++;
		}

		if (heltall < 0 ) {
			System.out.println("Ugyldig heltall, pr�v igjen");

		}
		else {
		System.out.println("Fakultetet av " + heltall2 + " er: " + fakultet);
		}
	}
}
