package zadaci_rucno;

import java.util.Scanner;

public class Zadatak_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj");
		int p = sc.nextInt();
		
		if (p >= 0) {
			if ( p % 2 == 0) {
				System.out.println("Broj je pozitivan i paran");
				}else { 
				System.out.print("Broj je pozitivan i neparan");
			}
		}else {
			if (p % 2 == 0) {
			System.out.print("Broj je negativan i paran");
			
		}else { 
			System.out.print("Broj je negativan i neparan");
		}

	}

}}
