package zadaci_rucno;

import java.util.Scanner;

// kucni red
public class Zadatak_25 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Unesite sat za predvidjeni rad:");
	int sat = sc.nextInt();
	
	if (sat < 6 || (sat >= 13 &&  sat < 17) || sat >= 22) {
		System.out.println("Radnici ne smiju praviti buku");
		
	}else {
		System.out.print("radnici smiju praviti buku");
	}

	}

}
