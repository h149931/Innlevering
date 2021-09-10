package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgave1o2 {
	public static void main(String[] args) {
		int inntekt = Integer.parseInt(showInputDialog("Skriv inn din bruttoinntekt: "));
		double sats;
		int trinn;
		double trinnskatt4;
		double trinnskatt3;
		double trinnskatt2;
		double trinnskatt1;
		double totalTrinnskatt = 0;

		// ble litt usikker på hvordan oppgaven ville jeg skulle regne ut skatten.
		// Gjorde 2 versjoner av utregningen, versjon B er kommentert ut under
		
		// Versjon A

		if (inntekt > 0 && inntekt <= 164100) {
			// sats = 0; Bukte sats i versjon B
			trinn = 0;
			totalTrinnskatt = 0;

		} else if (inntekt > 164100 && inntekt <= 230950) {
			// sats = 0.93;
			trinn = 1;
			trinnskatt1 = (inntekt - 164101) * 0.0093;
			totalTrinnskatt = trinnskatt1;

		} else if (inntekt > 230950 && inntekt <= 580650) {
			// sats = 2.41;
			trinn = 2;
			trinnskatt2 = (inntekt - 230951) * 0.0241;
			trinnskatt1 = (230950 - 164101) * 0.0093;
			totalTrinnskatt = trinnskatt2 + trinnskatt1;

		} else if (inntekt > 580650 && inntekt <= 934050) {
			// sats = 11.52;
			trinn = 3;

			trinnskatt3 = (inntekt - 580651) * 0.1152;
			trinnskatt2 = (580650 - 230951) * 0.0241;
			trinnskatt1 = (230950 - 164101) * 0.0093;
			totalTrinnskatt = trinnskatt3 + trinnskatt2 + trinnskatt1;
		} else {
			//sats = 14.52;
			trinn = 4;
			trinnskatt4 = (inntekt - 934051) * 0.1452;
			trinnskatt3 = (934050 - 580651) * 0.1152;
			trinnskatt2 = (580650 - 230951) * 0.0241;
			trinnskatt1 = (230950 - 164101) * 0.0093;
			totalTrinnskatt = trinnskatt4 + trinnskatt3 + trinnskatt2 + trinnskatt1;
		}
		
		double rundetTrinnskatt =Math.round(totalTrinnskatt*100.0)/100.0;

		System.out.println("Med din inntekt på " + inntekt + "kr er du på skattetrinn " + trinn + " og din skatt er på "
				+ rundetTrinnskatt +"kr");

		// Versjon B
//		 double trinnskatt = (sats*inntekt)/100;
//		 System.out.println("Du er på skattetrinn "+ trinn + " og din skatt er på "+ trinnskatt );
	}
}
