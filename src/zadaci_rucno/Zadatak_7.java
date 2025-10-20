package zadaci_rucno;

import java.util.Scanner;

//Marko voli biciklizam. Pošto Marko zna da je važno biti hidratizovan, pije vodu na svakih sat vremena vožnje bicikla i to pola litara vode. Kao ulaz poznato je vrijeme u satima, a treba štampati broj litara koje će Marko popiti, zaokruženo na najmanju vrijednost (donje cijelo). Primjer: time = 3 ----> litara = 1; time = 6.7---> litara = 3 ; time = 11.8--> litara = 5.
public class Zadatak_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tr = sc.nextDouble();
		int litara = (int)Math.floor(tr * 0.5);
		
		System.out.println(litara);
		
	
	}

}
