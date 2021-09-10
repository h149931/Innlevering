package no.hvl.dat100;

import java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class oppgave2 {

	public static void main(String[] args) {
		for (int studentNr = 1; studentNr <= 10; studentNr++) {

			int antallPoeng = Integer.parseInt(showInputDialog("Skriv inn poengsum (0-100): "));
			String karakter;

			if (antallPoeng >= 0 && antallPoeng < 40) {
				karakter = "F";
			}

			else if (antallPoeng >= 40 && antallPoeng < 50) {
				karakter = "E";
			} else if (antallPoeng >= 50 && antallPoeng < 59) {
				karakter = "D";
			}

			else if (antallPoeng >= 60 && antallPoeng < 79) {
				karakter = "C";
			} else if (antallPoeng >= 80 && antallPoeng < 89) {
				karakter = "B";
			} else if (antallPoeng >= 90 && antallPoeng <= 100) {
				karakter = "A";

			} else if (antallPoeng > 100 || antallPoeng < 0) {
				karakter = "Ugyldig, prøv igjen";
				studentNr--;
			}

			else
				karakter = "Ugyldig, prøv igjen";

			System.out.println("Student " + studentNr + "sin karakter er " + karakter);
		}
	}
}
