package zadaci_rucno;

import java.util.Scanner;

//Ako je cijena taksija za jedan kilometar 0.5e, a početna cijena je 1e, napisati program koji za unijeti broj pređenih kilometara računa cijenu vožnje.
public class Zadatak_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		double cijena = 1 + 0.5 * km;
		
		System.out.printf("%.2f%n", cijena);
		

	}

}
