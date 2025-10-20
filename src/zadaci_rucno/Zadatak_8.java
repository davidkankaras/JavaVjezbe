package zadaci_rucno;

import java.util.Scanner;

// Napisati program kojim se izračunava potrebna dužina trake za ivicu stoljnjaka kružnog oblika čija je površina P.
public class Zadatak_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double P = sc.nextDouble();
		double r = Math.sqrt(P/Math.PI);
		double duzina = 2 * Math.PI * r;
		
		System.out.printf("%.2f%n",duzina );
		

	}

}
