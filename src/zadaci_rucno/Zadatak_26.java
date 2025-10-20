package zadaci_rucno;
//. Napisati program kojim se proverava da li se može napraviti bašta u obliku trougla sa datim dužinama stranica.

import java.util.Scanner;

public class Zadatak_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite prvu stranicu");
		int a = sc.nextInt();
		System.out.print("Unestie drugu stranicu");
		int b = sc.nextInt();
		System.out.print("Unesite trecu stranicu");
		int c = sc.nextInt();
		
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Moze se napraviti trougao");
		}else {
			System.out.print("Ne moze se napraviti trougao");
		}
	

	}

}
