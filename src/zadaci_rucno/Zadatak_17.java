package zadaci_rucno;

import java.util.Scanner;

// Napisati program koji za zadati trocifreni broj računa zbir cifara tog broja.
public class Zadatak_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Unesi trocifreni broj");
			int trocifreni = sc.nextInt();
			
			if (trocifreni>=100 && trocifreni<=999 || trocifreni<= -100 && trocifreni >= -999) {
				
			
			trocifreni = Math.abs(trocifreni);
		//if trocifreni < 100;
		int a = trocifreni/100, b = (trocifreni/10)%10, c = trocifreni%10;
		
		System.out.println(a+b+c);
			}else {
				System.out.print("Broj nije trocifren");
				break;
			}
		}
	}
}
