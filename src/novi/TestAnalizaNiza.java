package novi;

import java.util.Scanner;

	public class TestAnalizaNiza {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Unesite duzinu niza: ");
	        int n = scanner.nextInt();

	        int[] niz = new int[n];

	        // Unos elemenata niza
	        for (int i = 0; i < n; i++) {
	            System.out.print("Unesite element [" + i + "]: ");
	            niz[i] = scanner.nextInt();
	        }

	        // Poziv metode iz klase AnalizaNiza
	        double prosjek = AnalizaNiza.nadjiParniPozitivniProsjek(niz);

	        // Ispis rezultata
	        if (prosjek != 0)
	            System.out.printf("Prosjecna vrijednost pozitivnih parnih brojeva: %.2f\n", prosjek);

	        scanner.close();
	    }
	}


