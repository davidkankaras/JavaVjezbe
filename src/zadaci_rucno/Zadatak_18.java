package zadaci_rucno;

import java.util.Scanner;

// Dobili ste zadatak da dešifrujete kod kojim se otvaraju tajna vrata. Otkrili ste da na osnovu poznatog trocifrenog broja možete pronaći kod koji otvara tajna vrata tako što od proizvoda cifara tog broja oduzmete zbir cifara istog broja.
public class Zadatak_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = Math.abs(n);
		int a = n/100, b = (n/10)%10, c = n%10;
		int zbir = a + b + c;
		int proizvod = a * b * c;
		
		int sifra = proizvod - zbir;
		
		System.out.println(sifra);
		

	}

}
